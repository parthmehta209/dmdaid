package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;
import play.data.format.*;



import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

@Entity 
@Table(name="question")
public class Question extends Model{

	private static final long serialVersionUID = 1L;

	@Id @Formats.DateTime(pattern="dd/MM/yyyy") 
	public Date date;

	
    @Column(columnDefinition = "LONGTEXT")
	public String esm;


    public static Model.Finder<Date,Question> find = new Model.Finder<Date,Question>(Date.class, Question.class);
	
	public Question() {}

	public static Question findQuestionBydate(Date date) {
        return find.where().eq("date", date).findUnique();
    }
}

