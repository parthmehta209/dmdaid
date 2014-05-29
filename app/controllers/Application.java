package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {



    // -- Authentication

    public static class Login {

        public String email;
        public String password;

        public String validate() {
            if(User.authenticate(email, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }

    }

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
                login.render(form(Login.class))
                );
    }

    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
    	System.out.println("Authenticating..");
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        String email= null, password = null;
        if(!loginForm.hasErrors()) {
			email = loginForm.get().email;
			if(email != null && User.findByEmail(email) == null) {
				System.out.println("User name not in database");
				loginForm.reject("email", "Invalid Email");
			}	
		}
        
        if(!loginForm.hasErrors()) {
			password = loginForm.get().password;
			if(password != null && User.authenticate(email, password) == null) {
				System.out.println("User name password does not match");
				loginForm.reject("password", "Invalid Email and password combination");
			}	
		}
        
        
        if(loginForm.hasErrors()) {
        	System.out.println("Authentication failure " + loginForm);
        	loginForm.reject("password", "Invalid Email and password combination");
            return badRequest(login.render(loginForm));
        } else {
        	System.out.println("Authentication Success");
            session("email", loginForm.get().email);
            return redirect(
                    routes.Dmdaid.index()
                    );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Application.login()
                );
    }

	/**
	 * Display the 'new computer form'.
	 */
	public static Result createUser() {
		Form<User> userForm = form(User.class);
		return ok(
				createUserForm.render(userForm)
				);
	}

	/**
	 * Handle the 'new computer form' submission 
	 */
	public static Result saveUser() {
		Form<User> filledForm = form(User.class).bindFromRequest();

		if(!filledForm.hasErrors()) {
			if(filledForm.get().firstname != null && !filledForm.get().firstname.matches("[a-zA-Z]*")) {
				filledForm.reject("firstname", "Invalid First Name");
			}
		}

		if(!filledForm.hasErrors()) {
			if(filledForm.get().lastname != null &&!filledForm.get().lastname.matches("[a-zA-Z]*")) {
				filledForm.reject("lastname", "Invalid Last Name");
			}	
		}

		if(!filledForm.hasErrors()) {
			String email = filledForm.get().email;
			if(email != null && User.findByEmail(email) != null) {
				filledForm.reject("email", "Email already Used");
			}	
		}

        if(!filledForm.hasErrors()) {
            String password = filledForm.get().password;
            if(password == null) {
                filledForm.reject("password", "password is needed");
            }   
        }

		if(!filledForm.hasErrors()) {
			String awareid = filledForm.get().awareid;
			if(!User.isAwareIdValid(awareid)) {
				filledForm.reject("awareid", "Invalid awareid");
			}	
		}

		if(filledForm.hasErrors()) {
            System.out.println("The form has errors" + filledForm);
			return badRequest(createUserForm.render(filledForm));
		}
		filledForm.get().save();
		flash("success", "Computer " + filledForm.get().firstname + " has been created");
		return redirect(
            routes.Application.login()
            );
	}



}

