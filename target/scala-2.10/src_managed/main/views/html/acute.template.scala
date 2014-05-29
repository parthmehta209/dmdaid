
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
object acute extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Guidelines"),"Acute Care Algorithm",username)/*7.63*/{_display_(Seq[Any](format.raw/*7.64*/("""
	
	<p>The following is an algorithm designed by a panel of expert physicians in Duchenne Muscular Dystrophy. These are not facts—rather, they are recommendations from clinicians familiar with neuromuscular disease to the physicians leading your acute care.</p>

  <p><a href="#">Acute Care Algorithm</a></p>
	
""")))})))}
    }
    
    def render(username:String): play.api.templates.HtmlFormat.Appendable = apply(username)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (username) => apply(username)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 24 01:22:07 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/acute.scala.html
                    HASH: bcadf07c99d7a4a7aaf1e1540be3f3fc36640e84
                    MATRIX: 774->1|894->40|926->64|1010->19|1038->38|1066->118|1104->122|1173->183|1211->184
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7
                    -- GENERATED --
                */
            