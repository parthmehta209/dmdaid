
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
object loginBase extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""   

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>DMD Aid</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.70*/routes/*12.76*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*12.115*/(""""">
        <link href=""""),_display_(Seq[Any](/*13.22*/routes/*13.28*/.Assets.at("stylesheets/main.css"))),format.raw/*13.62*/("""" rel="stylesheet"> 
    </head>

        
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">DMD AId</a>
            </div>
          </div>
        </div>        
        
       
        <div class="container">
          <div class="content">  
          """),_display_(Seq[Any](/*35.12*/content)),format.raw/*35.19*/("""
          </div>
        </div>
          
          
        </div>
      </div>
    </div>

    </body>
</html>

"""))}
    }
    
    def render(title:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 21 01:08:33 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/loginBase.scala.html
                    HASH: 12a01b6410038e4f4bb942fab67fb83eb315dbde
                    MATRIX: 781->1|903->29|1333->423|1348->429|1410->468|1471->493|1486->499|1542->533|2344->1299|2373->1306
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|63->35|63->35
                    -- GENERATED --
                */
            