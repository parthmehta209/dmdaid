
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""
<div class="form-group """),_display_(Seq[Any](/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""has-error""")))})),format.raw/*6.59*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    <div class="input">
    """),_display_(Seq[Any](/*9.6*/elements/*9.14*/.input)),format.raw/*9.20*/("""
    <span class="help-block">"""),_display_(Seq[Any](/*10.31*/elements/*10.39*/.infos.mkString(", "))),format.raw/*10.60*/("""</span>
    <p class="help-block">"""),_display_(Seq[Any](/*11.28*/elements/*11.36*/.errors(elements.lang).mkString(", "))),format.raw/*11.73*/("""</p>

	</div>
</div>


"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 23 17:08:19 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/twitterBootstrapInput.scala.html
                    HASH: 9f5ae43365a78d8a95a57c3ac9c6ed14c8386c75
                    MATRIX: 804->1|930->33|959->193|1019->218|1049->240|1088->242|1129->252|1184->272|1200->280|1224->283|1262->286|1278->294|1305->300|1377->338|1393->346|1420->352|1487->383|1504->391|1547->412|1618->447|1635->455|1694->492
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11
                    -- GENERATED --
                */
            