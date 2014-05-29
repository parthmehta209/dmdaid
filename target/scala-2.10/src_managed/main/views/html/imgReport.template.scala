
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
object imgReport extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Report,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(category: String)(report: Report):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),category,username)/*7.49*/{_display_(Seq[Any](format.raw/*7.50*/("""
	
	<h4>"""),_display_(Seq[Any](/*9.7*/report/*9.13*/.reportname)),format.raw/*9.24*/("""&nbsp&nbsp&nbsp"""),_display_(Seq[Any](/*9.40*/report/*9.46*/.date)),format.raw/*9.51*/("""</h4>

 	"""),_display_(Seq[Any](/*11.4*/for((picture,index) <- (report.imageList).zipWithIndex) yield /*11.59*/ {_display_(Seq[Any](format.raw/*11.61*/("""
	 	"""),_display_(Seq[Any](/*12.5*/if(index%2 == 0)/*12.21*/ {_display_(Seq[Any](format.raw/*12.23*/("""
	 		"""),_display_(Seq[Any](/*13.6*/if(index != 0)/*13.20*/ {_display_(Seq[Any](format.raw/*13.22*/("""
	 		<p></p>
	 		<p></p>
	 		</div>
	 		""")))})),format.raw/*17.6*/("""
	 		<div class="row">
	 	""")))})),format.raw/*19.5*/("""
 		<a href=""""),_display_(Seq[Any](/*20.14*/routes/*20.20*/.Assets.at("/healthReports/"+picture.imagePath))),format.raw/*20.67*/(""""><img  src=""""),_display_(Seq[Any](/*20.81*/routes/*20.87*/.Assets.at("/healthReports/"+picture.imagePath))),format.raw/*20.134*/("""" class="img-responsive img-thumbnail" alt="Responsive image" width="300" height="300"></a>
	
 	""")))})),format.raw/*22.4*/(""" 
	
""")))})))}
    }
    
    def render(username:String,category:String,report:Report): play.api.templates.HtmlFormat.Appendable = apply(username)(category)(report)
    
    def f:((String) => (String) => (Report) => play.api.templates.HtmlFormat.Appendable) = (username) => (category) => (report) => apply(username)(category)(report)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 24 10:22:39 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/imgReport.scala.html
                    HASH: fdb74899f42d63762675e0af11873188d420bd4d
                    MATRIX: 792->1|946->74|978->98|1064->53|1092->72|1120->154|1158->158|1213->205|1251->206|1294->215|1308->221|1340->232|1391->248|1405->254|1431->259|1476->269|1547->324|1587->326|1627->331|1652->347|1692->349|1733->355|1756->369|1796->371|1868->412|1926->439|1976->453|1991->459|2060->506|2110->520|2125->526|2195->573|2323->670
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|47->19|48->20|48->20|48->20|48->20|48->20|48->20|50->22
                    -- GENERATED --
                */
            