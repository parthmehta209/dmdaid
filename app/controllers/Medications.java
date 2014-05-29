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
public class Medications extends Controller {
	// expecting "med" or "otc"
	public static Result showMedications(String type) {
		String userName = Secured.getUsername();
		System.out.println("Medications : " + userName + " for type:" + type);


		List<Medication> medications;
		medications = Medication.findByUserAndType(userName, type);

		String typeDisplay = null;
		if(type.equals("med"))
			typeDisplay = "Medications";
		else 
			typeDisplay = "OTC Medications";

		return ok(medicationTable.render(userName,typeDisplay, medications,form(Medication.class),"noerror",type));
	}


	public static Result deleteMedication(int id) {
		Medication medication = Medication.findById(id);
		String type = medication.type;
		medication.delete();
		return redirect(routes.Medications.showMedications(type));
	}

	public static Result getDirtyMedications() {

		List<Medication> medications = Medication.getDirtyMedications(Secured.getUsername());
		return ok(Json.toJson(medications));
	}

	public static Result cleanDirtyMedications() {
		Medication.cleanDirtyMedications(Secured.getUsername());
		return ok("ok");
	}


	public static Result saveMedication(String type) {
		String userName = Secured.getUsername();
		Form<Medication> medForm = form(Medication.class).bindFromRequest();

		List<Medication> medications;
		medications = Medication.findByUserAndType(userName, type);
		String typeDisplay = null;
		if(type.equals("med"))
			typeDisplay = "Medications";
		else 
			typeDisplay = "OTC Medications";

		System.out.println("Medication Form :" + medForm);

		if(medForm.hasErrors()) {
			return ok(medicationTable.render(userName,typeDisplay, medications,form(Medication.class),"error",type));
		}

		Medication medication = medForm.get();
		String idString = medForm.data().get("_id");
		if(idString != null)
		{
			int id = Integer.parseInt(idString);
			medication._id = id;
		}
		System.out.println(Json.toJson(medication));
		if(medication._id != null && medication._id > 30000){
			medication.username = Secured.getUsername();
			medication.dirty = 0;
		} else {
			medication._id = Medication.getNextMedicationId();
			medication.dirty = 1;
		}

		medication.save();
		return redirect(routes.Medications.showMedications(type));
	}
}
