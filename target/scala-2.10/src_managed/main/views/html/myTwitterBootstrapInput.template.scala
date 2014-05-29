
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
object myTwitterBootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""
<div class="form-group """),_display_(Seq[Any](/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""has-error""")))})),format.raw/*6.59*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    <div class="input">
    <input name=""""),_display_(Seq[Any](/*9.19*/elements/*9.27*/.field.name)),format.raw/*9.38*/("""" id=""""),_display_(Seq[Any](/*9.45*/elements/*9.53*/.field.name)),format.raw/*9.64*/("""" value=""""),_display_(Seq[Any](/*9.74*/elements/*9.82*/.args.get('_value))),format.raw/*9.100*/("""" class="form-control """),_display_(Seq[Any](/*9.123*/elements/*9.131*/.args.get('_class))),format.raw/*9.149*/("""" type=""""),_display_(Seq[Any](/*9.158*/elements/*9.166*/.args.get('_type))),format.raw/*9.183*/("""" multiple>

    <span class="help-block">"""),_display_(Seq[Any](/*11.31*/elements/*11.39*/.infos.mkString(", "))),format.raw/*11.60*/("""</span>
    <p class="help-block">"""),_display_(Seq[Any](/*12.28*/elements/*12.36*/.errors(elements.lang).mkString(", "))),format.raw/*12.73*/("""</p>

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
                    DATE: Fri Apr 11 00:17:32 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/myTwitterBootstrapInput.scala.html
                    HASH: ed7436af4aa4f84042f5aec45f076397a2df1a73
                    MATRIX: 806->1|932->33|961->193|1021->218|1051->240|1090->242|1131->252|1186->272|1202->280|1226->283|1264->286|1280->294|1307->300|1393->351|1409->359|1441->370|1483->377|1499->385|1531->396|1576->406|1592->414|1632->432|1691->455|1708->463|1748->481|1793->490|1810->498|1849->515|1928->558|1945->566|1988->587|2059->622|2076->630|2135->667
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|35->9|37->11|37->11|37->11|38->12|38->12|38->12
                    -- GENERATED --
                */
            