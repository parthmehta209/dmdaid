
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""


"""),format.raw/*5.1*/("""
"""),format.raw/*6.80*/(""" 


"""),_display_(Seq[Any](/*9.2*/loginBase(Html("DMD Aid"))/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""

<div class="" id="loginModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3>Have an Account?</h3>
	</div>
	<div class="modal-body">
		<div class="well">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#login" data-toggle="tab">Login</a></li>
				
			</ul>
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane active in" id="login">
				"""),_display_(Seq[Any](/*24.6*/helper/*24.12*/.form(routes.Application.authenticate, 'class->"form-horizontal")/*24.77*/ {_display_(Seq[Any](format.raw/*24.79*/("""

						<fieldset>
							 """),_display_(Seq[Any](/*27.10*/inputText(loginForm("email"),
            				'_label -> "User Name(email)",
            				'type -> "text",
            				'class-> "form-control"
            				))),format.raw/*31.18*/("""
            				
            				"""),_display_(Seq[Any](/*33.18*/inputText(loginForm("password"),
            				'_label -> "Password",
            				'type -> "password",
            				'class-> "form-control"
            				))),format.raw/*37.18*/("""

							<div class="control-group">
								<!-- Button -->
								<div class="controls">
									<button class="btn btn-success">Login</button>   or <a href=""""),_display_(Seq[Any](/*42.72*/routes/*42.78*/.Application.createUser())),format.raw/*42.103*/("""" class="btn">Create Account</a> 
								</div>
							</div>
						</fieldset>
					""")))})),format.raw/*46.7*/("""
					
				</div>
						</div>
			</div>
		</div>
	</div>

<script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script class="cssdeck" src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
""")))})))}
    }
    
    def render(loginForm:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 21 01:08:33 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/login.scala.html
                    HASH: de42c89a6fe4b27720f9efed2d1d10d2883645c1
                    MATRIX: 791->1|929->59|961->83|1045->37|1074->57|1102->137|1141->142|1175->168|1214->170|1698->619|1713->625|1787->690|1827->692|1891->720|2080->887|2151->922|2339->1088|2538->1251|2553->1257|2601->1282|2719->1369
                    LINES: 26->1|29->6|29->6|30->1|33->5|34->6|37->9|37->9|37->9|52->24|52->24|52->24|52->24|55->27|59->31|61->33|65->37|70->42|70->42|70->42|74->46
                    -- GENERATED --
                */
            