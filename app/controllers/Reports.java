package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import play.libs.Json;
import play.mvc.*;
import play.mvc.Http.MultipartFormData.FilePart;
import play.data.*;
import play.data.DynamicForm.Dynamic;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
@Security.Authenticated(Secured.class)
public class Reports extends Controller {

	private static final String REPORTS_PATH = "public/healthReports/";

	public static Result showReportsTable(String category) {
		String userName = Secured.getUsername();
		System.out.println("Reports for : " + userName + " for category:" + category);
		
		
		List<Report> reports;
		
		if(category == null || category.equals("All Health Records")) {
			reports = Report.findByUser(userName);
			System.out.println("Number of reports in all are: " + reports.size());
		} else {
			reports = Report.findByUserAndCategory(userName, category);
		}
			

		return ok(reportsTable.render(userName,category, reports));
	}


	public static Result showReport(int id) {

		Report report = Report.findById(id);

		if(report.reporttype.equals("img")) {

			return ok(
					imgReport.render(report.username,report.category,report)
					);

		}else if (report.reporttype.equals("pdf")) {
			response().setHeader("Content-disposition","inline; filename="+report.pdfPath);
			return ok(new java.io.File(REPORTS_PATH + report.pdfPath));
		} else 
			return badRequest("The report type is invalid");



	}

	public static Result newReport(String type, String category) {
		String userName = Secured.getUsername();


		if(type.equals("img")) {
			return ok(newImgReport.render(userName,category,form(Report.class)));
		}

		if(!type.equals("pdf"))
			return forbidden("Improper Report Type");



		return ok(newPdfReport.render(userName,category,form(Report.class)));

	}

	public static Result pdfReportSave() {
		Form<Report> reportForm = form(Report.class).bindFromRequest();
		System.out.println("Report Form :" + reportForm);


		if(reportForm.hasErrors()) 
			return badRequest(newPdfReport.render(Secured.getUsername(),reportForm.data().get("category"),reportForm));

		Report report = reportForm.get();

		Http.MultipartFormData body;
		body = request().body().asMultipartFormData();
		Http.MultipartFormData.FilePart pdfFile = body.getFile("pdf");

		File file = pdfFile.getFile();
		if(!pdfFile.getContentType().equals("application/pdf")){
			reportForm.reject("pdf", "The file should be of type pdf");
			return badRequest(newPdfReport.render(Secured.getUsername(),report.category,reportForm));
		}
		String reportName = report.reportname+System.currentTimeMillis()+".pdf";
		file.renameTo(new File(REPORTS_PATH,reportName));
		report.pdf = new File(REPORTS_PATH,reportName);
		report.pdfPath = report.pdf.getName();
		report.dirty = 1;
		report.id = Report.getNextReportId();
		report.save();

		return redirect(
				routes.Reports.showReportsTable(report.category)
				);

	}

	
	public static Result deleteReport(int id) {
		Report report = Report.findById(id);
		String category = report.category;
		if(report.reporttype.equals("pdf")) {
			if(report.pdfPath != null) {
				File file = new File(REPORTS_PATH,report.pdfPath);
				file.delete();
			}
			report.delete();
		} else if(report.reporttype.equals("img")) {
			if(report.imageList != null) {
				for(Image image: report.imageList) {
					if(image.imagePath != null) {
						File file = new File(REPORTS_PATH,image.imagePath);
						file.delete();
					}
				}
			}
			report.delete();
		}

		return redirect(routes.Reports.showReportsTable(category));
	}


	public static Result imgReportSave() {
		Form<Report> reportForm = form(Report.class).bindFromRequest();
		System.out.println("Report Form :" + reportForm);


		if(reportForm.hasErrors()) 
			return badRequest(newImgReport.render(Secured.getUsername(),reportForm.data().get("category"),reportForm));

		Report report = reportForm.get();
		

		Http.MultipartFormData body;
		body = request().body().asMultipartFormData();
		List<FilePart> imgFiles = body.getFiles();

		report.images = new ArrayList<File>();
		report.imageList = new ArrayList<Image>();

		for(int i=0; i<imgFiles.size();i++) {
			FilePart filePart = imgFiles.get(i);
			File file = filePart.getFile();
			System.out.println("File type:" + filePart.getContentType());
			if(!filePart.getContentType().equals("image/jpeg")){
				reportForm.reject("pdf", "The files should be of type jpeg");
				return badRequest(newImgReport.render(Secured.getUsername(),report.category,reportForm));
			}
			String imageName = report.reportname+System.currentTimeMillis()+i+".jpeg";
			file.renameTo(new File(REPORTS_PATH,imageName));
			report.images.add(new File(REPORTS_PATH,imageName));
			report.imageList.add(new Image(imageName, report));
		}

		if(report.id != null && report.id > 30000){
			report.username = Secured.getUsername();
			report.dirty = 0;
		} else {
			report.id = Report.getNextReportId();
			report.dirty = 1;
		}

		report.save();

		return redirect(
				routes.Reports.showReportsTable(report.category)
				);
	}

	
	public static Result getDirtyReports() {

        List<Report> reports = Report.getDirtyReports();
        return ok(Json.toJson(reports));
	}
	
	public static Result setReportClean(int id) {
		Report.setReportClean(id);
		return ok("cleaned");
		
	}


}
