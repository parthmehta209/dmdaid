package models;

import java.io.File;
import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;

@Entity 
@Table(name="image")
public class Image extends Model{


	private static final long serialVersionUID = 1L;

	@Id
	public Integer id;

	@Required
	public String imagePath;	

	@ManyToOne
	Report report;

	public Image() {}

	public Image(String imagePath, Report report) {
		this.report = report;
		this.imagePath = imagePath;
	}

	

}

