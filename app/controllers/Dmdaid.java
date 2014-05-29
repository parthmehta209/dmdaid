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

import models.*;

/**
 * Manage a database of computers
 */
@Security.Authenticated(Secured.class)
public class Dmdaid extends Controller {

	public static Result index() {
		System.out.println("The user name is : " + Secured.getUsername());
		return ok(userlist.render(User.findAll(),Secured.getUsername()));
	}

//	public static Result qol() {
//
//		String userName = Secured.getUsername();
//		System.out.println("Qol for user : " + userName);
//		Form<QolStatement> qolForm = form(QolStatement.class);
//
//		if(QolStatement.findByUserName(userName) != null) {
//			System.out.println("Qol for user already present");
//			qolForm  = qolForm.fill(QolStatement.findByUserName(userName));
//		}
//		else {
//			System.out.println("Creating new Qol object and filling");
//			QolStatement qol = new QolStatement(userName); 
//			qolForm = qolForm.fill(qol);
//		}
//
//		return ok(qol.render(qolForm,userName,qolForm.get().getStatement()));
//
//	}

//	public static Result saveQol() {
//		Form<QolStatement> filledForm = form(QolStatement.class).bindFromRequest();
//
//		String userName = Secured.getUsername();
//		System.out.println("Qol form submitted" + filledForm);
//		QolStatement qolStatement = filledForm.get(); 
//		qolStatement.setEmail(userName);
//		if(QolStatement.findByUserName(userName) == null)
//			qolStatement.save();
//		else
//			qolStatement.update();
//		filledForm = filledForm.fill(qolStatement);
//		return ok(qol.render(filledForm,userName,qolStatement.getStatement()));
//	}

	public static Result fam() {

		String userName = Secured.getUsername();
		// generate a list of all contacts in the "fam" group and pass it to the page.

		List<Contact> list = Contact.findByUserAndGroup(userName, "fam");

		return ok(fam.render(userName,list));

	}

	public static Result contact(String group, Integer id,String relation) {
		Contact sampleContact = null;
		Form<Contact> contactForm = form(Contact.class);
		System.out.println("Group is: " + group + " Id: "+ id);
		// check if the contact exists. 

		// if yes then render the contact from the database

		// if no render the one after adding contact group.
		if(id == -1) {
			sampleContact = new Contact(Secured.getUsername(), group, "");
			sampleContact.relation = relation;
		} else {
			sampleContact = Contact.find.where().eq("id",id).findUnique();
			contactForm.fill(sampleContact);
		}
		return ok(
				contact.render(contactForm,sampleContact)
				);

	}

	public static Result saveContact() {

		List<Phone> phonenumbers = new ArrayList<Phone>();

		Form<Dynamic> filledForm = form().bindFromRequest();

		System.out.println(filledForm);
		// check for id if present
		Map<String,String> map = filledForm.data();
		System.out.println(map);
		Contact contact = new Contact();

		if(map.get("id")!=null && map.get("id")!="")
			contact.id = new Integer(map.get("id"));

		contact.groupname = map.get("groupname");
		contact.relation = map.get("relation");
		contact.username = map.get("username");
		contact.email = map.get("email");
		contact.name = map.get("name");
		contact.address = map.get("address");
		contact.miscinfo = map.get("miscinfo");

		for(int i=0;map.get("phonenumbers["+i+"]") != null;i++)
		{
			Phone phone = new Phone();
			phone.number = map.get("phonenumbers["+i+"]");
			phone.numbertype = map.get("type["+i+"]");
			phonenumbers.add(phone);
		}
		System.out.println("Phone numbers are " + phonenumbers);
		contact.phonenumbers = phonenumbers;

		if(contact.id != null) {
			Contact oldContact = Contact.find.ref(contact.id);
			if(oldContact != null)
				oldContact.delete();
		}
		contact.save();

		return redirectByGroup(contact.groupname);
	}


	private static Result redirectByGroup(String group) {
		if(group.equals("fam")) {
			return redirect(
					routes.Dmdaid.fam()
				);
		}
		else if(group.equals("neurology")) {
			return redirect(
					routes.HealthRecords.neurologyHome()
				);
		}
		return redirect(routes.Dmdaid.index());
			
	}

	public static Result deleteContact(String group, Integer id) {
		Contact.find.ref(id).delete();

		return redirectByGroup(group);
	}


	public static Result care() {

		return ok(
				care.render(Secured.getUsername())
				);
	}

	public static Result acute() {

		return ok(
				acute.render(Secured.getUsername())
				);
	}
}

