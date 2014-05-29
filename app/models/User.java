package models;

import java.util.*;
import javax.persistence.*;


import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity 
@Table(name="account")
public class User extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    @Constraints.Required
    @Formats.NonEmpty
    public String email;
    
    @Constraints.Required
    public String firstname;
    
    
    public String lastname;
    
    @Constraints.Required
    public String password;
    
    @Constraints.Required
    public String awareid;
    
    public Integer age; 

    
    // -- Queries
    
    public static Model.Finder<String,User> find = new Model.Finder<String,User>(String.class, User.class);
    
    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    /**
     * Retrive whether the aware id is valid
     * @param awareid2
     * @return
     */
	public static boolean isAwareIdValid(String awareid2) {
		// TODO Auto-generated method stub
		return true;
	}

    /**
     * Authenticate a User.
     */
    public static User authenticate(String email, String password) {
        return find.where()
            .eq("email", email)
            .eq("password", password)
            .findUnique();
    }
    
    // --
    
    public String toString() {
        return "User(" + email + ")";
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAwareid() {
		return awareid;
	}

	public void setAwareid(String awareid) {
		this.awareid = awareid;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}


