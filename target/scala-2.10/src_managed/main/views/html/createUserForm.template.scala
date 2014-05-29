
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
object createUserForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/loginBase(Html("Add user"))/*7.29*/{_display_(Seq[Any](format.raw/*7.30*/("""
    
    <h1>New Account</h1>
    
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.form(routes.Application.saveUser())/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
        
        <fieldset>
            """),_display_(Seq[Any](/*14.14*/inputText(userForm("firstname"),
            '_label -> "First Name",
            'type -> "text",
            'class-> "form-control"
            ))),format.raw/*18.14*/("""
            
            """),_display_(Seq[Any](/*20.14*/inputText(userForm("lastname"), 
            '_label -> "Last Name",'type -> "text",
            'class-> "form-control"
            ))),format.raw/*23.14*/("""
            
            """),_display_(Seq[Any](/*25.14*/inputText(userForm("email"),
            '_label -> "Email",
            'type -> "email",
            'class-> "form-control", 
            '_error -> userForm.error("email")
            ))),format.raw/*30.14*/("""

            """),_display_(Seq[Any](/*32.14*/inputText(userForm("password"),
            '_label -> "Password",
            'type -> "password",
            'class-> "form-control",
            '_error -> userForm.error("password")
            ))),format.raw/*37.14*/("""


            """),_display_(Seq[Any](/*40.14*/inputText(userForm("age"), 
            '_label -> "Age",
            'type -> "text",
            'class-> "form-control",
            '_error -> userForm.error("age")
            ))),format.raw/*45.14*/("""

            """),_display_(Seq[Any](/*47.14*/inputText(userForm("awareid"), 
            '_label -> "Aware ID",
            'type -> "text",
            'class-> "form-control",
            '_error -> userForm.error("awareid")
            ))),format.raw/*52.14*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this user" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*59.23*/routes/*59.29*/.Application.login())),format.raw/*59.49*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*62.6*/("""
    
""")))})))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 21 01:08:33 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/createUserForm.scala.html
                    HASH: eff258c150091743db3af2a10eaafd2c546a9d0a
                    MATRIX: 787->1|911->44|943->68|1027->23|1055->42|1083->122|1121->126|1156->153|1194->154|1270->195|1285->201|1330->237|1370->239|1448->281|1618->429|1681->456|1837->590|1900->617|2111->806|2162->821|2384->1021|2436->1037|2640->1219|2691->1234|2908->1429|3123->1608|3138->1614|3180->1634|3266->1689
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|39->11|42->14|46->18|48->20|51->23|53->25|58->30|60->32|65->37|68->40|73->45|75->47|80->52|87->59|87->59|87->59|90->62
                    -- GENERATED --
                */
            