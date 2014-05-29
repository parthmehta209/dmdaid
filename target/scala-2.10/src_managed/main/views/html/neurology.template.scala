
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
object neurology extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Contact],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(contacts: List[Contact]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),"Neurology Records",username)/*7.60*/{_display_(Seq[Any](format.raw/*7.61*/("""
	
	<p>Click the links below to enter your information</p>

	<p><a href=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Reports.showReportsTable("Neurology Records"))),format.raw/*11.67*/("""">Uploadable Neuroloy Reports</a></p>
	<p><a href=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Neurology.neuroMeds())),format.raw/*12.43*/("""">Current Medications and Prescriptions</a></p>  
	<p><a>Current homeopathic medications</a></p>
	<p><a>Home Care Regimen</a></p>
	<p><a href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Dmdaid.contact("neurology",-1,"Clinical Neurologist"))),format.raw/*15.75*/("""">Add Clinical Neurologist Contact Information</a></p>
 	"""),_display_(Seq[Any](/*16.4*/for(contact <- contacts) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
  <div class="box-shadow">
  		<h3>"""),_display_(Seq[Any](/*18.10*/contact/*18.17*/.relation)),format.raw/*18.26*/("""</h3>
      <div class="row">
        <div class="col-md-9">
          <p><strong>Name:</strong> """),_display_(Seq[Any](/*21.38*/contact/*21.45*/.name)),format.raw/*21.50*/("""</p>    
        </div>
      </div>
      """),_display_(Seq[Any](/*24.8*/if(contact.address != null)/*24.35*/ {_display_(Seq[Any](format.raw/*24.37*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Address:</strong> """),_display_(Seq[Any](/*27.41*/contact/*27.48*/.address)),format.raw/*27.56*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*30.8*/("""

      """),_display_(Seq[Any](/*32.8*/if(contact.email != null)/*32.33*/ {_display_(Seq[Any](format.raw/*32.35*/("""

      <div class="row">
        <div class="col-md-9">
          <p><strong>Email:</strong> """),_display_(Seq[Any](/*36.39*/contact/*36.46*/.email)),format.raw/*36.52*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*39.8*/("""
      """),_display_(Seq[Any](/*40.8*/if(contact.miscinfo != null)/*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Misc Info:</strong> """),_display_(Seq[Any](/*43.43*/contact/*43.50*/.miscinfo)),format.raw/*43.59*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*46.8*/("""
  		<div class="row">
        <div class="col-md-9">
          <strong>Phone Numbers</strong>
        </div>
      </div>
        """),_display_(Seq[Any](/*52.10*/for(phone <- contact.phonenumbers) yield /*52.44*/ {_display_(Seq[Any](format.raw/*52.46*/("""
        <div class="row">
            <div class="col-md-2">
              <strong> Type:</strong><p> """),_display_(Seq[Any](/*55.43*/phone/*55.48*/.numbertype)),format.raw/*55.59*/("""</p>
            </div>
            <div class="col-md-6">
              <strong> Number:</strong><p> """),_display_(Seq[Any](/*58.45*/phone/*58.50*/.number)),format.raw/*58.57*/("""</p>
            </div>
        </div>

        """)))})),format.raw/*62.10*/("""
      
  		
      <div class=row>
  		<a>&nbsp&nbsp&nbsp</a><a href=""""),_display_(Seq[Any](/*66.37*/routes/*66.43*/.Dmdaid.contact(contact.groupname,contact.id,""))),format.raw/*66.91*/("""" class="btn-xs btn-primary">Edit</a>
      </div>
  		<p></p>
  		<p></p>
    </div>
	""")))})),format.raw/*71.3*/(""" 
	
""")))})))}
    }
    
    def render(username:String,contacts:List[Contact]): play.api.templates.HtmlFormat.Appendable = apply(username)(contacts)
    
    def f:((String) => (List[Contact]) => play.api.templates.HtmlFormat.Appendable) = (username) => (contacts) => apply(username)(contacts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 11 16:56:07 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/neurology.scala.html
                    HASH: fb40c96a9160bdc3136ed0482ae8aad29bd2782c
                    MATRIX: 792->1|937->65|969->89|1055->44|1083->63|1111->145|1149->149|1215->207|1253->208|1363->282|1378->288|1446->334|1534->386|1549->392|1593->414|1773->558|1788->564|1864->618|1957->676|1997->700|2037->702|2110->739|2126->746|2157->755|2291->853|2307->860|2334->865|2413->909|2449->936|2489->938|2619->1032|2635->1039|2665->1047|2740->1091|2784->1100|2818->1125|2858->1127|2989->1222|3005->1229|3033->1235|3108->1279|3151->1287|3188->1315|3228->1317|3360->1413|3376->1420|3407->1429|3482->1473|3650->1605|3700->1639|3740->1641|3880->1745|3894->1750|3927->1761|4066->1864|4080->1869|4109->1876|4190->1925|4297->1996|4312->2002|4382->2050|4501->2138
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|49->21|49->21|49->21|52->24|52->24|52->24|55->27|55->27|55->27|58->30|60->32|60->32|60->32|64->36|64->36|64->36|67->39|68->40|68->40|68->40|71->43|71->43|71->43|74->46|80->52|80->52|80->52|83->55|83->55|83->55|86->58|86->58|86->58|90->62|94->66|94->66|94->66|99->71
                    -- GENERATED --
                */
            