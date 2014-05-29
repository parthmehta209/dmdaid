package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;



import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlQuery;
import com.avaje.ebean.SqlRow;

@Entity 
@Table(name="medication")
public class Medication extends Model{


	private static final long serialVersionUID = 1L;

	@Id
	public Integer _id;

	@Required
	public String medicationName ;

	
	@Required
	public Integer dose;


	@Required
	public String units;

	@Required
	public Integer times;

	@Required
	public String timesPer;
	
	public String startMonth; 
	public String endMonth;
	
	public String type;
	
	public Integer dirty;
	
	public String username; 
		
    public static Model.Finder<Integer,Medication> find = new Model.Finder<Integer,Medication>(Integer.class, Medication.class);
	
	public Medication() {}

	/**
	 * Retrive reports by user name and category
	 */
	public static List<Medication> findByUserAndType(String username,String type) {
        return find.where().eq("username", username).eq("type", type).findList();
    }
	
	public static List<Medication> getDirtyMedications(String username) {
        List<Medication> dirtyMeds =  find.where().eq("username",username).eq("dirty", 1).findList();
        
        return dirtyMeds;
        
    }
	
	public static void cleanDirtyMedications(String username) {
        List<Medication> dirtyMeds =  find.where().eq("username",username).eq("dirty", 1).findList();
        
        for(Medication med:dirtyMeds) {
        	med.dirty = 0;
        	med.update();
        }
        
        return;
        
    }
	
	
	public static void setMedicationClean(int id) {
		Medication report = find.ref(id);
		report.dirty = 0;
		report.update();
	}
	 /**
     * Retrieve a report by id.
     */
	
	public static int getNextMedicationId() {
		String sql = "select max(_id) as _id from (select _id from medication where _id<30000 ) as tab1";
		 SqlQuery sqlQuery = Ebean.createSqlQuery(sql); 
		 SqlRow result = sqlQuery.findUnique();
		 Integer ret = 0;
		 if(result != null) {
			 ret = result.getInteger("_id");
			 if(ret == null)
				 ret = 0;
		 }
		 return ret + 1;
	}
	
    public static Medication findById(Integer id) {
        return find.ref(id);
    }

}

