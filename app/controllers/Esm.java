package controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import modelsaware.Aware;
import modelsaware.EsmReply;

/**
 * Manage a database of computers
 */
@Security.Authenticated(Secured.class)
public class Esm extends Controller {

	public static Result getDailyEsm() {
		Date now = new Date();
		now.setHours(0);now.setMinutes(0);now.setSeconds(0);
		Question question = Question.findQuestionBydate(now);
		if(question == null) {
			return ok("none");
		}
		
		question.date = now;
		
		return ok(question.esm);
	}
	
	public static Result esmResults() {
		String userName = Secured.getUsername();
		User user = User.findByEmail(userName);
		List<EsmReply> esms = Aware.getEsmReplies(user.getAwareid());
		return ok(qol.render(userName, esms));	
	}
	
}

