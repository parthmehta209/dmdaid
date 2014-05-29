package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.validation.Valid;

@Entity 
@Table(name="contact")
public class Contact extends Model{


	private static final long serialVersionUID = 1L;

	@Id
	public Integer id;

	@Required
	public String groupname ;

	
	@Required
	public String relation;


	@Required
	public String username;


	@Required
	public String name;

	public String address;

	public String miscinfo;

	public String email;

	@OneToMany(cascade=CascadeType.ALL)
	public List<Phone> phonenumbers;


    public static Model.Finder<Integer,Contact> find = new Model.Finder<Integer,Contact>(Integer.class, Contact.class);
	
	public Contact() {}

	public Contact(String username, String group, String relation) {
		this.username = username;
		this.groupname = group;
		this.relation = relation;
	}

	 /**
     * Retrieve a User from email.
     */
    public static List<Contact> findByUserAndGroup(String email,String group) {
        return find.where().eq("username", email).eq("groupname", group).findList();
    }

    public static Contact findById(Integer id) {
        return find.ref(id);
    }

}

