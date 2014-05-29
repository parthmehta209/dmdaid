package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.Http.*;


import views.html.*;

import models.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
    // Access rights
    
    public static String getUsername() {
    	return Context.current().request().username();
    }

//    public static String isMemberOf(Long project) {
//        return Context.current().request().username();
//    }
//    
//    public static boolean isOwnerOf(Long task) {
//        return Task.isOwner(
//            task,
//            Context.current().request().username()
//        );
//    }
    
}