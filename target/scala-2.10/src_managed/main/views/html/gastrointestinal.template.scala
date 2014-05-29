
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
object gastrointestinal extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Contact],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(contacts: List[Contact]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),"Gastrointestinal/Nutrition Records",username)/*7.77*/{_display_(Seq[Any](format.raw/*7.78*/("""
	
	<p>Click the links below to enter your information</p>

	<p><a href=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Reports.showReportsTable("Gastrointestinal/Nutrition Records"))),format.raw/*11.84*/("""">Uploadable Neuroloy Reports</a></p>
	
	<p><a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Dmdaid.contact("gastrointestinal",-1,"Gastroantrologist"))),format.raw/*13.79*/("""">Add Gastroantrologist Contact Information</a></p>
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
                    DATE: Fri Apr 11 16:56:07 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/gastrointestinal.scala.html
                    HASH: ab21588bec5bc16bb1e50d012a1b7f5ac20b827b
                    MATRIX: 799->1|944->65|976->89|1062->44|1090->63|1118->145|1156->149|1239->224|1277->225|1387->299|1402->305|1487->368|1577->422|1592->428|1672->486|1762->541|1802->565|1842->567|1915->604|1931->611|1962->620|2096->718|2112->725|2139->730|2218->774|2254->801|2294->803|2424->897|2440->904|2470->912|2545->956|2589->965|2623->990|2663->992|2794->1087|2810->1094|2838->1100|2913->1144|2956->1152|2993->1180|3033->1182|3165->1278|3181->1285|3212->1294|3287->1338|3455->1470|3505->1504|3545->1506|3685->1610|3699->1615|3732->1626|3871->1729|3885->1734|3914->1741|3995->1790|4102->1861|4117->1867|4187->1915|4306->2003
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|47->19|47->19|47->19|50->22|50->22|50->22|53->25|53->25|53->25|56->28|58->30|58->30|58->30|62->34|62->34|62->34|65->37|66->38|66->38|66->38|69->41|69->41|69->41|72->44|78->50|78->50|78->50|81->53|81->53|81->53|84->56|84->56|84->56|88->60|92->64|92->64|92->64|97->69
                    -- GENERATED --
                */
            