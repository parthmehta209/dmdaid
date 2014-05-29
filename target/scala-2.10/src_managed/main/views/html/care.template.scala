
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object care extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),"Current Care Guidelines",username)/*7.66*/{_display_(Seq[Any](format.raw/*7.67*/("""
	
	<p>This section allows you to have the most recent and up to date care guidelines and standards of care regarding your condition at your fingertips. The following lists of items are written by experts in the care of Duchenne Muscular Dystrophy and are the same guidelines that your physician should be acquainted with. Click the links to learn about the standards of care and be sure to share this information with physicians treating you in any setting.</p>

  <p><a href="#">The Multidisciplinary Management of Duchenne Muscular Dystrophy</a></p>
  <p><a href="#">Update On Management of Duchenne Muscular Dystrophy</a></p>
  <p><a href="#">Cardiovascular Health Supervision for Individuals Affected by Duchenne and Becker Muscular Dystrophy</a></p>
  <p><a href="#">Practice Parameter: Corticosteroid Treatment of Duchenne Dystrophy</a></p>
  <p><a href="#">Respiratory Care of the Patient with Duchenne Muscular Dystrophy</a></p>
  <p><a href="#">American College of Chest Physicians Consensus Statement on the Respiratory and Related Management of Patients With Duchenne Muscular Dystrophy Undergoing Anesthesia or Sedation</a></p>
  <p><a href="#">The Diagnosis and Management of Duchenne Muscular Dystrophy—A Guide for Families</a></p>


	
""")))})))}
    }
    
    def render(username:String): play.api.templates.HtmlFormat.Appendable = apply(username)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (username) => apply(username)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 24 01:17:18 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/care.scala.html
                    HASH: 8c1218bd1093fec2ce0b49c9b9e5c3a2a6c50d4c
                    MATRIX: 773->1|893->40|925->64|1009->19|1037->38|1065->118|1103->122|1175->186|1213->187
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7
                    -- GENERATED --
                */
            