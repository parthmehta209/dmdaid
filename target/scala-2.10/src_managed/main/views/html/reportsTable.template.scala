
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
object reportsTable extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,List[Report],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(category: String)(reports: List[Report]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),category,username)/*7.49*/{_display_(Seq[Any](format.raw/*7.50*/("""
	
  <a href=""""),_display_(Seq[Any](/*9.13*/routes/*9.19*/.Reports.newReport("pdf",category))),format.raw/*9.53*/("""" type="button" class="btn btn-default">New Report (Pdf)</a>

  <a href=""""),_display_(Seq[Any](/*11.13*/routes/*11.19*/.Reports.newReport("img",category))),format.raw/*11.53*/("""" type="button" class="btn btn-default">New Report (Images)</a>

	<p>Click on the reports to view or edit reports</p>

  <table class="table table-hover table-bordered">
  <thead><tr>
    <th>Report</th>
    <th>Date</th>   
    """),_display_(Seq[Any](/*19.6*/if(category == "All Health Records")/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
    <th>Category</th>
    """)))})),format.raw/*21.6*/("""
    <th class="col-sm-1">Delete</th>
  </tr></thead>
  <tbody>
  """),_display_(Seq[Any](/*25.4*/for(report <- reports) yield /*25.26*/ {_display_(Seq[Any](format.raw/*25.28*/("""
  <tr>
    <td><a href=""""),_display_(Seq[Any](/*27.19*/routes/*27.25*/.Reports.showReport(report.id))),format.raw/*27.55*/("""" target="_blank">"""),_display_(Seq[Any](/*27.74*/report/*27.80*/.reportname)),format.raw/*27.91*/("""</a></td>
    <td><a href=""""),_display_(Seq[Any](/*28.19*/routes/*28.25*/.Reports.showReport(report.id))),format.raw/*28.55*/("""" target="_blank">"""),_display_(Seq[Any](/*28.74*/report/*28.80*/.date)),format.raw/*28.85*/("""</a></td>
    """),_display_(Seq[Any](/*29.6*/if(category == "All Health Records")/*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
      """),_display_(Seq[Any](/*30.8*/if(report.category == "All Health Records")/*30.51*/ {_display_(Seq[Any](format.raw/*30.53*/("""
        <td>Other</td>
      """)))})),format.raw/*32.8*/("""
      """),_display_(Seq[Any](/*33.8*/if(report.category != "All Health Records")/*33.51*/ {_display_(Seq[Any](format.raw/*33.53*/("""
        <td>"""),_display_(Seq[Any](/*34.14*/report/*34.20*/.category)),format.raw/*34.29*/("""</td>
      """)))})),format.raw/*35.8*/("""
    """)))})),format.raw/*36.6*/("""
    <td><a href=""""),_display_(Seq[Any](/*37.19*/routes/*37.25*/.Reports.deleteReport(report.id))),format.raw/*37.57*/("""" class="btn-xs btn-danger">Delete</a></td>
  </tr>
  """)))})),format.raw/*39.4*/(""" 
  </tbody>
  </table>


""")))})))}
    }
    
    def render(username:String,category:String,reports:List[Report]): play.api.templates.HtmlFormat.Appendable = apply(username)(category)(reports)
    
    def f:((String) => (String) => (List[Report]) => play.api.templates.HtmlFormat.Appendable) = (username) => (category) => (reports) => apply(username)(category)(reports)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 24 10:22:39 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/reportsTable.scala.html
                    HASH: 0f4c42c5c68b143b40fbd5ca9121eba7c1183bff
                    MATRIX: 801->1|962->81|994->105|1080->60|1108->79|1136->161|1174->165|1229->212|1267->213|1317->228|1331->234|1386->268|1496->342|1511->348|1567->382|1832->612|1877->648|1917->650|1976->678|2078->745|2116->767|2156->769|2218->795|2233->801|2285->831|2340->850|2355->856|2388->867|2452->895|2467->901|2519->931|2574->950|2589->956|2616->961|2666->976|2711->1012|2751->1014|2794->1022|2846->1065|2886->1067|2948->1098|2991->1106|3043->1149|3083->1151|3133->1165|3148->1171|3179->1180|3223->1193|3260->1199|3315->1218|3330->1224|3384->1256|3470->1311
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|47->19|47->19|47->19|49->21|53->25|53->25|53->25|55->27|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|64->36|65->37|65->37|65->37|67->39
                    -- GENERATED --
                */
            