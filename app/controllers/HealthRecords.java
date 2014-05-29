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
public class HealthRecords extends Controller {

	public static Result neurologyHome() {
		String userName = Secured.getUsername();
		List<Contact> list = Contact.findByUserAndGroup(userName, "neurology");
		return ok(neurology.render(userName,list));
	}
	
	public static Result respiratoryHome() {
		String userName = Secured.getUsername();
		List<Contact> list = Contact.findByUserAndGroup(userName, "respiratory");
		return ok(respiratory.render(userName,list));
	}

	public static Result gastrointestinalHome() {
		String userName = Secured.getUsername();
		List<Contact> list = Contact.findByUserAndGroup(userName, "gastrointestinal");
		return ok(gastrointestinal.render(userName,list));
	}
	
	public static Result cardiologyHome() {
		String userName = Secured.getUsername();
		List<Contact> list = Contact.findByUserAndGroup(userName, "cardiology");
		return ok(cardiology.render(userName,list));
	}

	public static Result musculoskeletalHome() {
		String userName = Secured.getUsername();
		List<Contact> list = Contact.findByUserAndGroup(userName, "musculoskeletal");
		return ok(musculoskeletal.render(userName,list));
	}
}

