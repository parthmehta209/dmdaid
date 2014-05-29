
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
object newPdfReport extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Form[Report],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(category: String)(reportForm: Form[Report]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),category,username)/*7.49*/{_display_(Seq[Any](format.raw/*7.50*/("""
	
  
	<p>Add a new report</p>
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.form(routes.Reports.pdfReportSave(),'enctype -> "multipart/form-data")/*11.83*/ {_display_(Seq[Any](format.raw/*11.85*/("""

      <fieldset>
        <input type="hidden" id="category" name="category" value=""""),_display_(Seq[Any](/*14.68*/category)),format.raw/*14.76*/("""">
        <input type="hidden" id="reporttype" name="reporttype" value="pdf">
        <input type="hidden" id="username" name="username" value=""""),_display_(Seq[Any](/*16.68*/username)),format.raw/*16.76*/("""">

        """),_display_(Seq[Any](/*18.10*/inputText(reportForm("reportname"),
            '_label -> "Report Name",
            '_type -> "text"
          ))),format.raw/*21.12*/("""
      
        """),_display_(Seq[Any](/*23.10*/inputText(reportForm("date"),
            '_label -> "Date",
            '_type -> "date"
          ))),format.raw/*26.12*/("""

        
        """),_display_(Seq[Any](/*29.10*/inputFile(reportForm("pdf"),
            '_label -> "Report File",
            '_type -> "file"
          ))),format.raw/*32.12*/("""

      </fieldset>
      
      <div class="actions">
        <input type="submit" class="btn primary" value="Save">
      </div>
    """)))})),format.raw/*39.6*/("""  

""")))})))}
    }
    
    def render(username:String,category:String,reportForm:Form[Report]): play.api.templates.HtmlFormat.Appendable = apply(username)(category)(reportForm)
    
    def f:((String) => (String) => (Form[Report]) => play.api.templates.HtmlFormat.Appendable) = (username) => (category) => (reportForm) => apply(username)(category)(reportForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 11 13:20:58 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/newPdfReport.scala.html
                    HASH: 21e583d81cce74b98042d72157a540108463d653
                    MATRIX: 801->1|965->84|997->108|1083->63|1111->82|1139->164|1177->168|1232->215|1270->216|1341->252|1356->258|1436->329|1476->331|1598->417|1628->425|1810->571|1840->579|1889->592|2025->706|2078->723|2201->824|2257->844|2386->951|2553->1087
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|39->11|42->14|42->14|44->16|44->16|46->18|49->21|51->23|54->26|57->29|60->32|67->39
                    -- GENERATED --
                */
            