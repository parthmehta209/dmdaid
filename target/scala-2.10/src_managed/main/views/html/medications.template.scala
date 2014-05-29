
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
object medications extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,List[Medication],Form[Medication],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(medicationType: String)(medications : List[Medication])(medForm:Form[Medication]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),medicationType,username)/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""

  <table class="table table-hover table-bordered">
  <thead><tr>
    <th>Name</th>
    <th class="col-sm-1">Dose</th>
    <th class="col-sm-1">Units</th>
    <th class="col-sm-1">Times</th>
    <th class="col-sm-1">Per</th>
    <th class="col-sm-2">Start mm/yyyy</th>
    <th class="col-sm-2">End mm/yyyy</th>   
    <th class="col-sm-1">Delete</th>
  </tr></thead>
  <tbody>
  """),_display_(Seq[Any](/*21.4*/for(medication <- medications) yield /*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
  <tr>
    <td>"""),_display_(Seq[Any](/*23.10*/medication/*23.20*/.medicationName)),format.raw/*23.35*/("""</td>
    <td>"""),_display_(Seq[Any](/*24.10*/medication/*24.20*/.dose)),format.raw/*24.25*/("""</td>
    <td>"""),_display_(Seq[Any](/*25.10*/medication/*25.20*/.units)),format.raw/*25.26*/("""</td>
    <td>"""),_display_(Seq[Any](/*26.10*/medication/*26.20*/.times)),format.raw/*26.26*/("""</td>
    <td>"""),_display_(Seq[Any](/*27.10*/medication/*27.20*/.timesPer)),format.raw/*27.29*/("""</td>
    <td>"""),_display_(Seq[Any](/*28.10*/medication/*28.20*/.startMonth)),format.raw/*28.31*/("""</td>
    <td>"""),_display_(Seq[Any](/*29.10*/medication/*29.20*/.endMonth)),format.raw/*29.29*/("""</td>
    <td><a href="" class="btn-xs btn-danger">Delete</a></td>
  </tr>
  """)))})),format.raw/*32.4*/(""" 
  </tbody>
  </table>


  """),_display_(Seq[Any](/*37.4*/if( medicationType == "OTC Medications")/*37.44*/{_display_(Seq[Any](format.raw/*37.45*/("""  
    <form action="/medications/otc" method="POST" class="form-inline">  
  """)))})),format.raw/*39.4*/("""
  """),_display_(Seq[Any](/*40.4*/if( medicationType == "Medications" )/*40.41*/{_display_(Seq[Any](format.raw/*40.42*/("""  
    <form action="/medications/med" method="POST" class="form-inline">  
  """)))})),format.raw/*42.4*/("""


    <fieldset>
      <input type="hidden" id="type" name="type" value=""""),_display_(Seq[Any](/*46.58*/medicationType)),format.raw/*46.72*/("""">
      <input type="hidden" id="username" name="username" value=""""),_display_(Seq[Any](/*47.66*/username)),format.raw/*47.74*/("""">
      
      <div class="form-group">
      <label class="sr-only" for="medicationName">Medication Name</label>
      <input type="text" class="form-control" id="medicationName" placeholder="Medication Name">
      </div>
      
      <div class="form-group">
      <label class="sr-only" for="dose">Dose</label>
      <input type="text" class="form-control" id="dose" placeholder="Dose">
      </div>

    </fieldset>
     
    <div class="actions">
      <input type="submit" class="btn primary" value="Save">
    </div>
  </form>    

""")))})),format.raw/*66.2*/("""
"""))}
    }
    
    def render(username:String,medicationType:String,medications:List[Medication],medForm:Form[Medication]): play.api.templates.HtmlFormat.Appendable = apply(username)(medicationType)(medications)(medForm)
    
    def f:((String) => (String) => (List[Medication]) => (Form[Medication]) => play.api.templates.HtmlFormat.Appendable) = (username) => (medicationType) => (medications) => (medForm) => apply(username)(medicationType)(medications)(medForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 18 14:49:11 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/medications.scala.html
                    HASH: 87f345115c32b9101cd870fcbf1febf3a0af32fb
                    MATRIX: 821->1|1023->122|1055->146|1142->101|1170->120|1198->202|1236->206|1297->259|1335->260|1751->641|1797->671|1837->673|1890->690|1909->700|1946->715|1997->730|2016->740|2043->745|2094->760|2113->770|2141->776|2192->791|2211->801|2239->807|2290->822|2309->832|2340->841|2391->856|2410->866|2443->877|2494->892|2513->902|2544->911|2653->989|2717->1018|2766->1058|2805->1059|2915->1138|2954->1142|3000->1179|3039->1180|3149->1259|3260->1334|3296->1348|3400->1416|3430->1424|4003->1966
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|60->32|65->37|65->37|65->37|67->39|68->40|68->40|68->40|70->42|74->46|74->46|75->47|75->47|94->66
                    -- GENERATED --
                */
            