package modelsaware;

import java.io.File;
import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import scala.collection.mutable.LinkedList;
import views.html.helper.select;



import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;


public class Aware extends Model{


	private static final long serialVersionUID = 1L;


	public static Model.Finder<Integer,Aware> find = new Model.Finder<Integer,Aware>(Integer.class, Aware.class);

	public Aware() {}


	public static List<EsmReply> getEsmReplies(String awareid) {

		EbeanServer secondary = Ebean.getServer("secondary");
		String sql = "select esm_title,esm_user_answer,timestamp from esms where esm_user_answer!='' " +
				"and device_id='"+awareid+"'";
		secondary.createSqlQuery(sql);


		SqlQuery sqlQuery = secondary.createSqlQuery(sql); 
		List<SqlRow> results = sqlQuery.findList();
		List<EsmReply> replies = new ArrayList<EsmReply>();
		for(SqlRow result:results) {
			EsmReply reply = new EsmReply();
			reply.esmQuestion = result.getString("esm_title"); 
			reply.esmAnswer = result.getString("esm_user_answer");
			double ts = result.getDouble("timestamp");
			reply.timestamp = new Date((long)ts).toString();
			replies.add(reply);
		}
		return replies;
	}



}

