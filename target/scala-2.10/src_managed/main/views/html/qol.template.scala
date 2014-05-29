
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
object qol extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[modelsaware.EsmReply],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(esms : List[modelsaware.EsmReply]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Show Users"),"Quality of life statement",username)/*7.63*/{_display_(Seq[Any](format.raw/*7.64*/("""
	
	<table class="table table-hover table-bordered">
        <thead><tr>
            <th>Time n Date</th>
            <th>Question</th>   
             <th class="col-sm-1">Answer</th>
        </tr></thead>
        <tbody>
        """),_display_(Seq[Any](/*16.10*/for(esm <- esms) yield /*16.26*/ {_display_(Seq[Any](format.raw/*16.28*/("""
            <tr>
            <td>"""),_display_(Seq[Any](/*18.18*/esm/*18.21*/.timestamp)),format.raw/*18.31*/("""</td>
            <td>"""),_display_(Seq[Any](/*19.18*/esm/*19.21*/.esmQuestion)),format.raw/*19.33*/("""</td>
            <td>"""),_display_(Seq[Any](/*20.18*/esm/*20.21*/.esmAnswer)),format.raw/*20.31*/("""</td>
            </tr>
        """)))})),format.raw/*22.10*/(""" 
        </tbody>
    </table>
""")))})))}
    }
    
    def render(username:String,esms:List[modelsaware.EsmReply]): play.api.templates.HtmlFormat.Appendable = apply(username)(esms)
    
    def f:((String) => (List[modelsaware.EsmReply]) => play.api.templates.HtmlFormat.Appendable) = (username) => (esms) => apply(username)(esms)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 17 19:20:57 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/qol.scala.html
                    HASH: bf3036113dd9d5749e5b773f66d1c388745a302f
                    MATRIX: 799->1|954->75|986->99|1070->54|1098->73|1126->153|1164->157|1233->218|1271->219|1539->451|1571->467|1611->469|1682->504|1694->507|1726->517|1785->540|1797->543|1831->555|1890->578|1902->581|1934->591|1999->624
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22
                    -- GENERATED --
                */
            