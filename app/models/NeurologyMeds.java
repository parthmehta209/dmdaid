package models;

import java.util.*;
import javax.persistence.*;


import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity 
@Table(name="neurologymeds")
public class NeurologyMeds extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    String email;

    @Column(columnDefinition = "LONGTEXT")
    public String meds;
    
    
    // -- Queries
    
    public static Model.Finder<String,NeurologyMeds> find = new Model.Finder<String,NeurologyMeds>(String.class, NeurologyMeds.class);
    
    public NeurologyMeds(String email) {
		this.email = email;
		meds = "Write about medications here";
	}

	/**
     * Retrieve all users.
     */
    public static List<NeurologyMeds> findAll() {
        return find.all();
    }

    /**
     * Retrieve a qol statement by email.
     */
    public static NeurologyMeds findByUserName(String email) {
        return find.where().eq("email", email).findUnique();
    }

	
	public String getMedications() {
		return meds;
	}

	public void setMedications(String statement) {
		this.meds = statement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}


