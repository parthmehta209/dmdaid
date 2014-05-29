
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
object fam extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Contact],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String)(contacts : List[Contact]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(Html("Care Givers"),"Family Member and Care Giver Info",username)/*7.72*/{_display_(Seq[Any](format.raw/*7.73*/("""
	
	<a href=""""),_display_(Seq[Any](/*9.12*/routes/*9.18*/.Dmdaid.contact("fam",-1,"Sibling"))),format.raw/*9.53*/("""" class="btn">Add Sibling Info</a>
	<a href=""""),_display_(Seq[Any](/*10.12*/routes/*10.18*/.Dmdaid.contact("fam",-1,"Mother"))),format.raw/*10.52*/("""" class="btn">Add Mother Info</a>
  <a href=""""),_display_(Seq[Any](/*11.13*/routes/*11.19*/.Dmdaid.contact("fam",-1,"Father"))),format.raw/*11.53*/("""" class="btn">Add Father Info</a>
  <a href=""""),_display_(Seq[Any](/*12.13*/routes/*12.19*/.Dmdaid.contact("fam",-1,"Primary Care Giver"))),format.raw/*12.65*/("""" class="btn">Add Primary Care Giver Info</a>
  <a href=""""),_display_(Seq[Any](/*13.13*/routes/*13.19*/.Dmdaid.contact("fam",-1,"Nurse"))),format.raw/*13.52*/("""" class="btn">Add Nurse Info</a>
  <a href=""""),_display_(Seq[Any](/*14.13*/routes/*14.19*/.Dmdaid.contact("fam",-1,""))),format.raw/*14.47*/("""" class="btn">Add New Contact</a>            

	<p>This section will display all the contacts of the primary care givers and the family members</p>
	   
	"""),_display_(Seq[Any](/*18.3*/for(contact <- contacts) yield /*18.27*/ {_display_(Seq[Any](format.raw/*18.29*/("""
  <div class="box-shadow">
  		<h3>"""),_display_(Seq[Any](/*20.10*/contact/*20.17*/.relation)),format.raw/*20.26*/("""</h3>
      <div class="row">
        <div class="col-md-9">
          <p><strong>Name:</strong> """),_display_(Seq[Any](/*23.38*/contact/*23.45*/.name)),format.raw/*23.50*/("""</p>    
        </div>
      </div>
      """),_display_(Seq[Any](/*26.8*/if(contact.address != null)/*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Address:</strong> """),_display_(Seq[Any](/*29.41*/contact/*29.48*/.address)),format.raw/*29.56*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*32.8*/("""

      """),_display_(Seq[Any](/*34.8*/if(contact.email != null)/*34.33*/ {_display_(Seq[Any](format.raw/*34.35*/("""

      <div class="row">
        <div class="col-md-9">
          <p><strong>Email:</strong> """),_display_(Seq[Any](/*38.39*/contact/*38.46*/.email)),format.raw/*38.52*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*41.8*/("""
      """),_display_(Seq[Any](/*42.8*/if(contact.miscinfo != null)/*42.36*/ {_display_(Seq[Any](format.raw/*42.38*/("""
  		<div class="row">
        <div class="col-md-9">
          <p><strong>Misc Info:</strong> """),_display_(Seq[Any](/*45.43*/contact/*45.50*/.miscinfo)),format.raw/*45.59*/("""</p>    
        </div>
      </div>
      """)))})),format.raw/*48.8*/("""
  		<div class="row">
        <div class="col-md-9">
          <strong>Phone Numbers</strong>
        </div>
      </div>
        """),_display_(Seq[Any](/*54.10*/for(phone <- contact.phonenumbers) yield /*54.44*/ {_display_(Seq[Any](format.raw/*54.46*/("""
        <div class="row">
            <div class="col-md-2">
              <strong> Type:</strong><p> """),_display_(Seq[Any](/*57.43*/phone/*57.48*/.numbertype)),format.raw/*57.59*/("""</p>
            </div>
            <div class="col-md-6">
              <strong> Number:</strong><p> """),_display_(Seq[Any](/*60.45*/phone/*60.50*/.number)),format.raw/*60.57*/("""</p>
            </div>
        </div>

        """)))})),format.raw/*64.10*/("""
      
  		
      <div class=row>
  		<a>&nbsp&nbsp&nbsp</a><a href=""""),_display_(Seq[Any](/*68.37*/routes/*68.43*/.Dmdaid.contact(contact.groupname,contact.id,""))),format.raw/*68.91*/("""" class="btn-xs btn-primary">Edit</a>
      </div>
  		<p></p>
  		<p></p>
    </div>
	""")))})),format.raw/*73.3*/(""" 

	
""")))})))}
    }
    
    def render(username:String,contacts:List[Contact]): play.api.templates.HtmlFormat.Appendable = apply(username)(contacts)
    
    def f:((String) => (List[Contact]) => play.api.templates.HtmlFormat.Appendable) = (username) => (contacts) => apply(username)(contacts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 11 16:56:07 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/fam.scala.html
                    HASH: aa560003d956f3f43ccfe25f59068c475a977748
                    MATRIX: 786->1|932->66|964->90|1048->45|1076->64|1104->144|1142->148|1220->218|1258->219|1307->233|1321->239|1377->274|1459->320|1474->326|1530->360|1612->406|1627->412|1683->446|1765->492|1780->498|1848->544|1942->602|1957->608|2012->641|2093->686|2108->692|2158->720|2348->875|2388->899|2428->901|2501->938|2517->945|2548->954|2682->1052|2698->1059|2725->1064|2804->1108|2840->1135|2880->1137|3010->1231|3026->1238|3056->1246|3131->1290|3175->1299|3209->1324|3249->1326|3380->1421|3396->1428|3424->1434|3499->1478|3542->1486|3579->1514|3619->1516|3751->1612|3767->1619|3798->1628|3873->1672|4041->1804|4091->1838|4131->1840|4271->1944|4285->1949|4318->1960|4457->2063|4471->2068|4500->2075|4581->2124|4688->2195|4703->2201|4773->2249|4892->2337
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|48->20|48->20|48->20|51->23|51->23|51->23|54->26|54->26|54->26|57->29|57->29|57->29|60->32|62->34|62->34|62->34|66->38|66->38|66->38|69->41|70->42|70->42|70->42|73->45|73->45|73->45|76->48|82->54|82->54|82->54|85->57|85->57|85->57|88->60|88->60|88->60|92->64|96->68|96->68|96->68|101->73
                    -- GENERATED --
                */
            