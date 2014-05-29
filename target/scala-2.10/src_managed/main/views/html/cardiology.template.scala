
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
object cardiology extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Contact],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(contacts: List[Contact]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),"Cardiology Records",username)/*7.61*/{_display_(Seq[Any](format.raw/*7.62*/("""
	
	<p>Click the links below to enter your information</p>

	<p><a href=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Reports.showReportsTable("Cardiology Records"))),format.raw/*11.68*/("""">Uploadable Cardiology Reports</a></p>
	
	<p><a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Dmdaid.contact("cardiology",-1,"Cardiologist"))),format.raw/*13.68*/("""">Add Clinical Neurologist Contact Information</a></p>
 	"""),_display_(Seq[Any](/*14.4*/for(contact <- contacts) yield /*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
  <div class="box-shadow">
  		<h3>"""),_display_(Seq[Any](/*16.10*/contact/*16.17*/.relation)),format.raw/*16.26*/("""</h3>
      <div class="row">
        <div class="col-md-9">
          <p><strong>Name:</strong> """),_display_(Seq[Any](/*19.38*/contact/*19.45*/.name)),format.raw/*19.50*/("""</p>    
        </div>
      </div>
      """),_display_(Seq[Any](/*22.8*/if(contact.address != null)/*22.35*/ {_display_(Seq[Any](format.raw/*22.37*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Address:</strong> """),_display_(Seq[Any](/*25.41*/contact/*25.48*/.address)),format.raw/*25.56*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*28.8*/("""

      """),_display_(Seq[Any](/*30.8*/if(contact.email != null)/*30.33*/ {_display_(Seq[Any](format.raw/*30.35*/("""

      <div class="row">
        <div class="col-md-9">
          <p><strong>Email:</strong> """),_display_(Seq[Any](/*34.39*/contact/*34.46*/.email)),format.raw/*34.52*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*37.8*/("""
      """),_display_(Seq[Any](/*38.8*/if(contact.miscinfo != null)/*38.36*/ {_display_(Seq[Any](format.raw/*38.38*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Misc Info:</strong> """),_display_(Seq[Any](/*41.43*/contact/*41.50*/.miscinfo)),format.raw/*41.59*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*44.8*/("""
  		<div class="row">
        <div class="col-md-9">
          <strong>Phone Numbers</strong>
        </div>
      </div>
        """),_display_(Seq[Any](/*50.10*/for(phone <- contact.phonenumbers) yield /*50.44*/ {_display_(Seq[Any](format.raw/*50.46*/("""
        <div class="row">
            <div class="col-md-2">
              <strong> Type:</strong><p> """),_display_(Seq[Any](/*53.43*/phone/*53.48*/.numbertype)),format.raw/*53.59*/("""</p>
            </div>
            <div class="col-md-6">
              <strong> Number:</strong><p> """),_display_(Seq[Any](/*56.45*/phone/*56.50*/.number)),format.raw/*56.57*/("""</p>
            </div>
        </div>

        """)))})),format.raw/*60.10*/("""
      
  		
      <div class=row>
  		<a>&nbsp&nbsp&nbsp</a><a href=""""),_display_(Seq[Any](/*64.37*/routes/*64.43*/.Dmdaid.contact(contact.groupname,contact.id,""))),format.raw/*64.91*/("""" class="btn-xs btn-primary">Edit</a>
      </div>
  		<p></p>
  		<p></p>
    </div>
	""")))})),format.raw/*69.3*/(""" 
	
""")))})))}
    }
    
    def render(username:String,contacts:List[Contact]): play.api.templates.HtmlFormat.Appendable = apply(username)(contacts)
    
    def f:((String) => (List[Contact]) => play.api.templates.HtmlFormat.Appendable) = (username) => (contacts) => apply(username)(contacts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 11 16:56:28 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/cardiology.scala.html
                    HASH: f9454b0ef8f8f7e9196ff99be4eecd0561f3fe75
                    MATRIX: 793->1|938->65|970->89|1056->44|1084->63|1112->145|1150->149|1217->208|1255->209|1365->283|1380->289|1449->336|1541->392|1556->398|1625->445|1718->503|1758->527|1798->529|1871->566|1887->573|1918->582|2052->680|2068->687|2095->692|2174->736|2210->763|2250->765|2380->859|2396->866|2426->874|2501->918|2545->927|2579->952|2619->954|2750->1049|2766->1056|2794->1062|2869->1106|2912->1114|2949->1142|2989->1144|3121->1240|3137->1247|3168->1256|3243->1300|3411->1432|3461->1466|3501->1468|3641->1572|3655->1577|3688->1588|3827->1691|3841->1696|3870->1703|3951->1752|4058->1823|4073->1829|4143->1877|4262->1965
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|47->19|47->19|47->19|50->22|50->22|50->22|53->25|53->25|53->25|56->28|58->30|58->30|58->30|62->34|62->34|62->34|65->37|66->38|66->38|66->38|69->41|69->41|69->41|72->44|78->50|78->50|78->50|81->53|81->53|81->53|84->56|84->56|84->56|88->60|92->64|92->64|92->64|97->69
                    -- GENERATED --
                */
            