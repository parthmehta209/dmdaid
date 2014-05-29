
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
object medicationTable extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,List[Medication],Form[Medication],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(medicationType: String)(medications : List[Medication])(medForm:Form[Medication])(error:String)(medType:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.132*/("""

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
    <td><a href=""""),_display_(Seq[Any](/*30.19*/routes/*30.25*/.Medications.deleteMedication(medication._id))),format.raw/*30.70*/("""" class="btn-xs btn-danger">Delete</a></td>
  </tr>
  """)))})),format.raw/*32.4*/(""" 
  </tbody>
  </table>


 """),_display_(Seq[Any](/*37.3*/helper/*37.9*/.form(routes.Medications.saveMedication(medType))/*37.58*/ {_display_(Seq[Any](format.raw/*37.60*/("""

      <fieldset>
        <input type="hidden" id="type" name="type" value=""""),_display_(Seq[Any](/*40.60*/medType)),format.raw/*40.67*/("""">
        <input type="hidden" id="username" name="username" value=""""),_display_(Seq[Any](/*41.68*/username)),format.raw/*41.76*/("""">
        <div class="row">

        <div class="form-group col-sm-4">
        <label class="sr-only" for="medicationName">Medication Name</label>
        <input type="text" class="form-control col-sm-4" id="medicationName" name="medicationName" placeholder="Med Name">
        </div>

        <div class="form-group col-sm-2">
        <label class="sr-only" for="dose">Dose</label>
        <input type="number" class="form-control col-sm-2" id="dose" name="dose" placeholder="Dose">
        </div>

        <div class="form-group col-sm-2">
        <select id="units" name="units" class="form-control col-sm-2">
          <option value="mg">mg</option>
          <option value="ml">ml</option>
          <option value="units">units</option>
          <option value="puffs">puffs</option>
          <option value="tablets">tablets</option>
          <option value="mg/kg">mg/kg</option>
        </select>
        </div>

        <div class="form-group col-sm-2">
        <label class="sr-only" for="times">Times</label>
        <input type="number" class="form-control col-sm-2" id="times" name="times" placeholder="Times">
        </div>

        <div class="form-group col-sm-2">
        <select id="timesPer" name="timesPer" class="form-control col-sm-2">
          <option value="day">day</option>
          <option value="week">week</option>
          <option value="month">month</option>
          <option value="PRN">PRN</option>
        </select>
        </div>
      </div>
      <div class="row">
      <div class="form-group col-sm-3">
        <label class="sr-only" for="startMonth">Start Month</label>
        <input type="text" class="form-control col-sm-3" id="startMonth" name="startMonth" placeholder="Start Month mm/yyyy">
      </div>

        <div class="form-group col-sm-3">
        <label class="sr-only" for="endMonth">End Month</label>
        <input type="text" class="form-control col-sm-3" id="endMonth" name="endMonth" placeholder="End Month mm/yyyy">
         <p class="help-block">"""),_display_(Seq[Any](/*88.33*/if(error=="error")/*88.51*/{_display_(Seq[Any](format.raw/*88.52*/("""
          The form has errors
         """)))})),format.raw/*90.11*/("""</p>
        </div>        

        <div class="actions col-sm-4">
        <input type="submit" class="btn primary col-sm-4" value="Save">
      </div>
      </div>
      
      </fieldset>
      
      
    """)))})),format.raw/*101.6*/("""
""")))})))}
    }
    
    def render(username:String,medicationType:String,medications:List[Medication],medForm:Form[Medication],error:String,medType:String): play.api.templates.HtmlFormat.Appendable = apply(username)(medicationType)(medications)(medForm)(error)(medType)
    
    def f:((String) => (String) => (List[Medication]) => (Form[Medication]) => (String) => (String) => play.api.templates.HtmlFormat.Appendable) = (username) => (medicationType) => (medications) => (medForm) => (error) => (medType) => apply(username)(medicationType)(medications)(medForm)(error)(medType)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 18 17:01:39 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/medicationTable.scala.html
                    HASH: 8f644ac7cb62cea61a04cff812406780f93a508a
                    MATRIX: 839->1|1071->152|1103->176|1190->131|1218->150|1246->232|1284->236|1345->289|1383->290|1799->671|1845->701|1885->703|1938->720|1957->730|1994->745|2045->760|2064->770|2091->775|2142->790|2161->800|2189->806|2240->821|2259->831|2287->837|2338->852|2357->862|2388->871|2439->886|2458->896|2491->907|2542->922|2561->932|2592->941|2652->965|2667->971|2734->1016|2820->1071|2883->1099|2897->1105|2955->1154|2995->1156|3109->1234|3138->1241|3244->1311|3274->1319|5324->3333|5351->3351|5390->3352|5463->3393|5705->3603
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|65->37|65->37|65->37|65->37|68->40|68->40|69->41|69->41|116->88|116->88|116->88|118->90|129->101
                    -- GENERATED --
                */
            