package models;

import java.util.*;
import javax.persistence.*;


import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity 
@Table(name="qolstatement")
public class QolStatement extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    String email;

    @Column(columnDefinition = "LONGTEXT")
    public String statement;
    
    
    // -- Queries
    
    public static Model.Finder<String,QolStatement> find = new Model.Finder<String,QolStatement>(String.class, QolStatement.class);
    
    public QolStatement(String email) {
		this.email = email;
		statement = "Sample statement";
	}

	/**
     * Retrieve all users.
     */
    public static List<QolStatement> findAll() {
        return find.all();
    }

    /**
     * Retrieve a qol statement by email.
     */
    public static QolStatement findByUserName(String email) {
        return find.where().eq("email", email).findUnique();
    }

	
	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}


