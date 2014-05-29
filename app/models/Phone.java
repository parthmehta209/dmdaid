package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.validation.Valid;

@Entity 
@Table(name="phone")
public class Phone extends Model {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	Integer id;
	
    @Required
    //@Pattern(value = "[0-9.+]+", message = "A valid phone number is required")
    public String number;
    
    @Required
    public String numbertype;
    
    @ManyToOne
    Contact contact;
    
    public Phone() {}
                
    public Phone(String number, String description) {
        this.number = number;
        this.numbertype = description;
    }
    
    @Override
    public String toString() {
    	return "Type: " + numbertype + " Number:" +number;
    }
    
}
