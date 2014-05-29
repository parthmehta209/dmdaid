
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
object userlist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[User],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users : List[User])(username: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Show Users"),"Profile",username)/*3.45*/{_display_(Seq[Any](format.raw/*3.46*/("""
	
	
	<a class="btn success" id="add" href=""""),_display_(Seq[Any](/*6.41*/routes/*6.47*/.Application.createUser())),format.raw/*6.72*/("""">Add a new user</a>

	<table class="table table-condensed">
	 <thead>
                <tr>
                <th>Email</th>
                <th>password</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Aware Id</th>
                </tr>
    </thead>
    <tbody>
	  	"""),_display_(Seq[Any](/*20.6*/for(user <- users) yield /*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
	  		<tr>
	  		<td>"""),_display_(Seq[Any](/*22.11*/user/*22.15*/.getEmail())),format.raw/*22.26*/("""</td>
	  		<td>"""),_display_(Seq[Any](/*23.11*/user/*23.15*/.getPassword())),format.raw/*23.29*/("""</td>
	  		<td>"""),_display_(Seq[Any](/*24.11*/user/*24.15*/.getFirstname())),format.raw/*24.30*/("""</td>
	  		<td>"""),_display_(Seq[Any](/*25.11*/user/*25.15*/.getLastname())),format.raw/*25.29*/("""</td>
	  		<td>"""),_display_(Seq[Any](/*26.11*/user/*26.15*/.getAge())),format.raw/*26.24*/("""</td>
	  		<td>"""),_display_(Seq[Any](/*27.11*/user/*27.15*/.getAwareid())),format.raw/*27.28*/("""</td>
	  		</tr>
	  	""")))})),format.raw/*29.6*/("""
	</tbody>
	</table>
""")))})))}
    }
    
    def render(users:List[User],username:String): play.api.templates.HtmlFormat.Appendable = apply(users)(username)
    
    def f:((List[User]) => (String) => play.api.templates.HtmlFormat.Appendable) = (users) => (username) => apply(users)(username)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 21 01:08:33 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/userlist.scala.html
                    HASH: b91613d88aa777d7406c3c3a93c5b9044fe073ed
                    MATRIX: 788->1|920->39|957->42|1008->85|1046->86|1126->131|1140->137|1186->162|1564->505|1598->523|1637->524|1694->545|1707->549|1740->560|1792->576|1805->580|1841->594|1893->610|1906->614|1943->629|1995->645|2008->649|2044->663|2096->679|2109->683|2140->692|2192->708|2205->712|2240->725|2293->747
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29
                    -- GENERATED --
                */
            