package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;



import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

@Entity 
@Table(name="report")
public class Report extends Model{


	private static final long serialVersionUID = 1L;

	@Id
	public Integer id;

	@Required
	public String category ;

	
	@Required
	public String date;


	@Required
	public String reporttype;

	@Required
	public String username;

	@Required
	public String reportname;
	
	public String pdfPath; 
	
	@Transient
	public File pdf;
	
	@Transient
	public List<File> images;
	
	@OneToMany(cascade=CascadeType.ALL)
	public List<Image> imageList;

	public Integer dirty;
		
    public static Model.Finder<Integer,Report> find = new Model.Finder<Integer,Report>(Integer.class, Report.class);
	
	public Report() {}

	public Report(String name, String category, String date, String type, String username) {
		this.reportname = name;
		this.category = category;
		this.date = date;
		this.reporttype = type;
		this.username = username;
	}

	/**
	 * Retrive reports by user name and category
	 */
	public static List<Report> findByUserAndCategory(String username,String category) {
        return find.where().eq("username", username).eq("category", category).findList();
    }
	
	public static List<Report> findByUser(String username) {
        return find.where().eq("username", username).findList();
    }
	
	public static List<Report> getDirtyReports() {
        return find.where().eq("dirty", 1).findList();
        
    }
	
	public static void setReportClean(int id) {
		Report report = find.ref(id);
		report.dirty = 0;
		report.update();
	}
	 /**
     * Retrieve a report by id.
     */
	
	public static int getNextReportId() {
		String sql = "select max(id) as id from (select id from report where id<30000 ) as tab1";
		 SqlQuery sqlQuery = Ebean.createSqlQuery(sql); 
		 SqlRow result = sqlQuery.findUnique();
		 Integer ret = 0;
		 if(result != null) {
			 ret = result.getInteger("id");
			 if(ret == null)
				 ret = 0;
		 }
		 return ret + 1;
	}
	
    public static Report findById(Integer id) {
        return find.ref(id);
    }

}

