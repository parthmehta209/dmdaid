package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import play.mvc.*;
import play.data.*;
import play.data.DynamicForm.Dynamic;
import play.data.validation.Constraints.Required;
import static play.data.Form.*;

import views.html.*;
import views.html.helper.textarea;

import models.*;

/**
 * Manage a database of computers
 */
@Security.Authenticated(Secured.class)
public class Neurology extends Controller {

	
	public static Result neuroMeds() {
		String userName = Secured.getUsername();
		System.out.println("Nero Meds for : " + userName);
		Form<NeurologyMeds> medsForm = form(NeurologyMeds.class);

		if(NeurologyMeds.findByUserName(userName) != null) {
			System.out.println("Qol for user already present");
			medsForm  = medsForm.fill(NeurologyMeds.findByUserName(userName));
		}
		else {
			System.out.println("Creating new Qol object and filling");
			NeurologyMeds meds = new NeurologyMeds(userName); 
			medsForm = medsForm.fill(meds);
		}

		return ok(neuromeds.render(medsForm,userName,medsForm.get().getMedications()));
	}

	public static Result neuroMedsSave() {
		Form<NeurologyMeds> filledForm = form(NeurologyMeds.class).bindFromRequest();

		String userName = Secured.getUsername();
		System.out.println("Neuro meds form submitted" + filledForm);
		NeurologyMeds neuroMeds = filledForm.get(); 
		neuroMeds.setEmail(userName);
		if(NeurologyMeds.findByUserName(userName) == null)
			neuroMeds.save();
		else
			neuroMeds.update();
		filledForm = filledForm.fill(neuroMeds);
		return ok(neuromeds.render(filledForm,userName,neuroMeds.getMedications()));
	}
}

