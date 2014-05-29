
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Html,String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "Profile", username: String = "sampleUser")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.88*/("""   

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
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery-1.11.0.min.js"))),format.raw/*14.75*/("""" type="text/javascript"></script>
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
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-right">
                <li><a href=""""),_display_(Seq[Any](/*32.31*/routes/*32.37*/.Dmdaid.index())),format.raw/*32.52*/("""">"""),_display_(Seq[Any](/*32.55*/username)),format.raw/*32.63*/("""</a></li>
                <li><a href=""""),_display_(Seq[Any](/*33.31*/routes/*33.37*/.Application.logout())),format.raw/*33.58*/("""">Logout</a></li>
              </ul>
            </div>
          </div>
        </div>        
        
         <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class=""""),_display_(Seq[Any](/*43.25*/("active".when(nav == "Profile")))),format.raw/*43.58*/("""">
                <a href=""""),_display_(Seq[Any](/*44.27*/routes/*44.33*/.Dmdaid.index())),format.raw/*44.48*/("""">Profile</a></li>
            <li class=""""),_display_(Seq[Any](/*45.25*/("active".when(nav == "Family Member and Care Giver Info")))),format.raw/*45.84*/("""">
                <a href=""""),_display_(Seq[Any](/*46.27*/routes/*46.33*/.Dmdaid.fam())),format.raw/*46.46*/("""">Family Member and Care Giver Info</a></li>
            <li class=""""),_display_(Seq[Any](/*47.25*/("active".when(nav == "Current Care Guidelines")))),format.raw/*47.74*/("""">
                <a href=""""),_display_(Seq[Any](/*48.27*/routes/*48.33*/.Dmdaid.care())),format.raw/*48.47*/("""">Current Care Guidelines</a></li>
            <li class=""""),_display_(Seq[Any](/*49.25*/("active".when(nav == "Hospital Stay Log")))),format.raw/*49.68*/("""">
                <a href="#">Hospital Stay Log</a></li>
            <li class=""""),_display_(Seq[Any](/*51.25*/("active".when(nav == "Acute Care Algorithm")))),format.raw/*51.71*/("""">
                <a href=""""),_display_(Seq[Any](/*52.27*/routes/*52.33*/.Dmdaid.acute())),format.raw/*52.48*/("""">Acute Care Algorithm</a></li>
            <li class=""""),_display_(Seq[Any](/*53.25*/("active".when(nav == "Quality of life statement")))),format.raw/*53.76*/("""">
                <a href=""""),_display_(Seq[Any](/*54.27*/routes/*54.33*/.Esm.esmResults())),format.raw/*54.50*/("""">Quality of life statement</a></li>
            <li class=""""),_display_(Seq[Any](/*55.25*/("active".when(nav == "Neurology Records")))),format.raw/*55.68*/("""">
                <a href=""""),_display_(Seq[Any](/*56.27*/routes/*56.33*/.HealthRecords.neurologyHome())),format.raw/*56.63*/("""">Neurology Records</a></li>
            <li class=""""),_display_(Seq[Any](/*57.25*/("active".when(nav == "Respiratory/Pulmonology Records")))),format.raw/*57.82*/("""">
                <a href=""""),_display_(Seq[Any](/*58.27*/routes/*58.33*/.HealthRecords.respiratoryHome())),format.raw/*58.65*/("""">Respiratory/Pulmonology Records</a></li>
            <li class=""""),_display_(Seq[Any](/*59.25*/("active".when(nav == "Gastrointestinal/Nutrition Records")))),format.raw/*59.85*/("""">
                <a href=""""),_display_(Seq[Any](/*60.27*/routes/*60.33*/.HealthRecords.gastrointestinalHome())),format.raw/*60.70*/("""">Gastrointestinal/Nutrition Records</a></li>
            <li class=""""),_display_(Seq[Any](/*61.25*/("active".when(nav == "Cardiology Records")))),format.raw/*61.69*/("""">
                <a href=""""),_display_(Seq[Any](/*62.27*/routes/*62.33*/.HealthRecords.cardiologyHome())),format.raw/*62.64*/("""">Cardiology Records</a></li>
            <li class=""""),_display_(Seq[Any](/*63.25*/("active".when(nav == "Musculoskeletal Records")))),format.raw/*63.74*/("""">
                <a href=""""),_display_(Seq[Any](/*64.27*/routes/*64.33*/.HealthRecords.musculoskeletalHome())),format.raw/*64.69*/("""">Musculoskeletal Records</a></li>
            <li class=""""),_display_(Seq[Any](/*65.25*/("active".when(nav == "All Health Records")))),format.raw/*65.69*/("""">
                <a href=""""),_display_(Seq[Any](/*66.27*/routes/*66.33*/.Reports.showReportsTable("All Health Records"))),format.raw/*66.80*/("""">All Health Records</a></li>    
            <li class=""""),_display_(Seq[Any](/*67.25*/("active".when(nav == "Medications")))),format.raw/*67.62*/("""">
                <a href=""""),_display_(Seq[Any](/*68.27*/routes/*68.33*/.Medications.showMedications("med"))),format.raw/*68.68*/("""">Medications</a></li>    
			<li class=""""),_display_(Seq[Any](/*69.16*/("active".when(nav == "OTC Medications")))),format.raw/*69.57*/("""">
                <a href=""""),_display_(Seq[Any](/*70.27*/routes/*70.33*/.Medications.showMedications("otc"))),format.raw/*70.68*/("""">OTC Medications</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">"""),_display_(Seq[Any](/*74.36*/nav)),format.raw/*74.39*/("""</h1>
        <div class="container">
          <div class="content">  
          """),_display_(Seq[Any](/*77.12*/content)),format.raw/*77.19*/("""
          </div>
        </div>
          
          
        </div>
      </div>
    </div>

    </body>
</html>

"""))}
    }
    
    def render(title:Html,nav:String,username:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav,username)(content)
    
    def f:((Html,String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav,username) => (content) => apply(title,nav,username)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 18 13:58:52 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/main.scala.html
                    HASH: 8cedc7b3b55fab1601a1d48fde02c37b70fc7f59
                    MATRIX: 790->1|970->87|1400->481|1415->487|1477->526|1538->551|1553->557|1609->591|1687->633|1702->639|1770->685|2588->1467|2603->1473|2640->1488|2679->1491|2709->1499|2785->1539|2800->1545|2843->1566|3159->1846|3214->1879|3279->1908|3294->1914|3331->1929|3410->1972|3491->2031|3556->2060|3571->2066|3606->2079|3711->2148|3782->2197|3847->2226|3862->2232|3898->2246|3993->2305|4058->2348|4176->2430|4244->2476|4309->2505|4324->2511|4361->2526|4453->2582|4526->2633|4591->2662|4606->2668|4645->2685|4742->2746|4807->2789|4872->2818|4887->2824|4939->2854|5028->2907|5107->2964|5172->2993|5187->2999|5241->3031|5344->3098|5426->3158|5491->3187|5506->3193|5565->3230|5671->3300|5737->3344|5802->3373|5817->3379|5870->3410|5960->3464|6031->3513|6096->3542|6111->3548|6169->3584|6264->3643|6330->3687|6395->3716|6410->3722|6479->3769|6573->3827|6632->3864|6697->3893|6712->3899|6769->3934|6847->3976|6910->4017|6975->4046|6990->4052|7047->4087|7254->4258|7279->4261|7398->4344|7427->4351
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|60->32|60->32|60->32|60->32|60->32|61->33|61->33|61->33|71->43|71->43|72->44|72->44|72->44|73->45|73->45|74->46|74->46|74->46|75->47|75->47|76->48|76->48|76->48|77->49|77->49|79->51|79->51|80->52|80->52|80->52|81->53|81->53|82->54|82->54|82->54|83->55|83->55|84->56|84->56|84->56|85->57|85->57|86->58|86->58|86->58|87->59|87->59|88->60|88->60|88->60|89->61|89->61|90->62|90->62|90->62|91->63|91->63|92->64|92->64|92->64|93->65|93->65|94->66|94->66|94->66|95->67|95->67|96->68|96->68|96->68|97->69|97->69|98->70|98->70|98->70|102->74|102->74|105->77|105->77
                    -- GENERATED --
                */
            