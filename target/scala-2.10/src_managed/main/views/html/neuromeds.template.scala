
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
object neuromeds extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[NeurologyMeds],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(medsForm : Form[NeurologyMeds])(username: String)(statement : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Show Users"),"Neurology Medications and Prescriptions",username)/*7.77*/{_display_(Seq[Any](format.raw/*7.78*/("""
	
	<h3>Write about prescriptions and medications here</h3>
	
	    """),_display_(Seq[Any](/*11.7*/helper/*11.13*/.form(routes.Neurology.neuroMedsSave())/*11.52*/ {_display_(Seq[Any](format.raw/*11.54*/("""
        
        <fieldset>
            <textarea class="form-control" rows="10" id="meds" name="meds">"""),_display_(Seq[Any](/*14.77*/statement)),format.raw/*14.86*/("""</textarea>            
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save" class="btn primary"> 
        </div>
        
    """)))})),format.raw/*21.6*/("""

	
""")))})))}
    }
    
    def render(medsForm:Form[NeurologyMeds],username:String,statement:String): play.api.templates.HtmlFormat.Appendable = apply(medsForm)(username)(statement)
    
    def f:((Form[NeurologyMeds]) => (String) => (String) => play.api.templates.HtmlFormat.Appendable) = (medsForm) => (username) => (statement) => apply(medsForm)(username)(statement)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 24 04:00:25 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/neuromeds.scala.html
                    HASH: c2f744c5ccd7f5a1609846a162628a202bd5bfd4
                    MATRIX: 805->1|977->92|1009->116|1093->71|1121->90|1149->170|1187->174|1270->249|1308->250|1411->318|1426->324|1474->363|1514->365|1655->470|1686->479|1897->659
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|39->11|42->14|42->14|49->21
                    -- GENERATED --
                */
            