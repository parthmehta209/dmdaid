
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
object contact extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Contact],Contact,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contactForm: Form[Contact])(contact: Contact):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/phoneField/*8.12*/(field: Field, className: String = "phone"):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.59*/("""
    """),_display_(Seq[Any](/*9.6*/input(field, '_label -> "Phone numbers", '_class -> className)/*9.68*/ { (id, name, value, _) =>_display_(Seq[Any](format.raw/*9.94*/("""
        <input type="text" name=""""),_display_(Seq[Any](/*10.35*/name)),format.raw/*10.39*/("""" value=""""),_display_(Seq[Any](/*10.49*/value)),format.raw/*10.54*/(""""> 
        <a class="removePhone btn danger">Remove</a>
    """)))})),format.raw/*12.6*/("""
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myTwitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.82*/(""" 


"""),format.raw/*13.2*/("""



"""),_display_(Seq[Any](/*17.2*/main(Html("Contact"),"Contact Information",contact.username)/*17.62*/{_display_(Seq[Any](format.raw/*17.63*/("""
	
	"""),_display_(Seq[Any](/*19.3*/helper/*19.9*/.form(routes.Dmdaid.saveContact())/*19.43*/ {_display_(Seq[Any](format.raw/*19.45*/("""

        <fieldset>

        <input type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*23.56*/contact/*23.63*/.id)),format.raw/*23.66*/("""">
    
		
		<input type="hidden" id="username" name="username" value=""""),_display_(Seq[Any](/*26.62*/contact/*26.69*/.username)),format.raw/*26.78*/("""">

		<input type="hidden" id="groupname" name="groupname" value=""""),_display_(Seq[Any](/*28.64*/contact/*28.71*/.groupname)),format.raw/*28.81*/("""">

			"""),_display_(Seq[Any](/*30.5*/inputText(contactForm("relation"),
            '_label -> "Relation",
            '_value-> contact.relation,
            '_type -> "text"
            ))),format.raw/*34.14*/("""

            """),_display_(Seq[Any](/*36.14*/inputText(contactForm("name"),
            '_label -> "Name",
            '_type -> "text",
            '_value-> contact.name
            ))),format.raw/*40.14*/("""

            """),_display_(Seq[Any](/*42.14*/inputText(contactForm("address"),
            '_label -> "Address",
            '_type -> "text",
            '_value-> contact.address
            ))),format.raw/*46.14*/("""

			"""),_display_(Seq[Any](/*48.5*/inputText(contactForm("email"),
            '_label -> "Email",
            '_type -> "email",
            '_value-> contact.email
            ))),format.raw/*52.14*/("""

			"""),_display_(Seq[Any](/*54.5*/inputText(contactForm("miscinfo"),
            '_label -> "Misc Info",
            '_type -> "text",
            '_value-> contact.miscinfo
            ))),format.raw/*58.14*/("""

        """),_display_(Seq[Any](/*60.10*/if(contact.phonenumbers.size()  == 0)/*60.47*/ {_display_(Seq[Any](format.raw/*60.49*/("""

        <div class="phones">
            <div class="row">
                <div class="col-xs-2">
                    """),_display_(Seq[Any](/*65.22*/inputText(contactForm("type[0]"),
                    '_label -> "Type",
                    'type -> "text",
                    '_class -> "numbertype"
                    ))),format.raw/*69.22*/("""    
              </div>
                <div class="col-xs-3">
                    """),_display_(Seq[Any](/*72.22*/inputText(contactForm("phonenumbers[0]"),
                    '_label -> "Phone Number",
                    'type -> "text",
                    '_class -> "phone"
                    ))),format.raw/*76.22*/("""
                </div>
            </div>            
        </div>
        """)))}/*80.11*/else/*80.16*/{_display_(Seq[Any](format.raw/*80.17*/("""

            """),_display_(Seq[Any](/*82.14*/for( (phone,index) <- (contact.phonenumbers).zipWithIndex ) yield /*82.73*/{_display_(Seq[Any](format.raw/*82.74*/("""
            <div class="phones">
            <div class="row">
                <div class="col-xs-2">
                    """),_display_(Seq[Any](/*86.22*/inputText(contactForm("type[0]"),
                    '_label -> "Type",
                    '_type -> "text",
                    '_class -> "numbertype",
                    '_value -> phone.numbertype
                    ))),format.raw/*91.22*/("""    
              </div>
                <div class="col-xs-3">
                    """),_display_(Seq[Any](/*94.22*/inputText(contactForm("phonenumbers[0]"),
                    '_label -> "Phone Number",
                    '_type -> "text",
                    '_class -> "phone",
                    '_value -> phone.number
                    ))),format.raw/*99.22*/("""
                </div>
                """),_display_(Seq[Any](/*101.18*/if(index > 0)/*101.31*/ {_display_(Seq[Any](format.raw/*101.33*/("""
                <div class = "col-xs-0.5">
                    
                <button type="button" class="btn-xs btn-danger removePhone">Remove Phone</button>
    
                </div>
                """)))})),format.raw/*107.18*/("""
            </div>            
        </div>
            """)))})),format.raw/*110.14*/(""" 


        """)))})),format.raw/*113.10*/("""
        
            

    <a type="button" class="btn btn-success addPhone">Add Phone</a>
    <p></p>


    </fieldset>
		<div class="actions">
            <input type="submit" class="btn primary" value="Save">
            """),_display_(Seq[Any](/*124.14*/if(contact.id != null)/*124.36*/ {_display_(Seq[Any](format.raw/*124.38*/("""
            <a href=""""),_display_(Seq[Any](/*125.23*/routes/*125.29*/.Dmdaid.deleteContact(contact.groupname,contact.id))),format.raw/*125.80*/("""" class="btn btn-danger">Delete Contact</a>
            """)))})),format.raw/*126.14*/("""
            <a href=""""),_display_(Seq[Any](/*127.23*/routes/*127.29*/.Dmdaid.index())),format.raw/*127.44*/("""" class="btn">Cancel</a>
        </div>



	""")))})),format.raw/*132.3*/("""

    

    <div class= "phone-template" style="display: none;">
                <div class="row">
                <div class="col-xs-2">
                    """),_display_(Seq[Any](/*139.22*/inputText(contactForm("type[0]"),
                    '_label -> "Type",
                    '_type -> "text",
                    '_class -> "numbertype"
                    ))),format.raw/*143.22*/("""    
              </div>
                <div class="col-xs-3">
                    """),_display_(Seq[Any](/*146.22*/inputText(contactForm("phonenumbers[0]"),
                    '_label -> "Phone Number",
                    '_type -> "text",
                    '_class -> "phone"
                    ))),format.raw/*150.22*/("""
                </div>
                <div class = "col-xs-0.5">
                    
                <button type="button" class="btn-xs btn-danger removePhone">Remove Phone</button>
    
                </div>
            </div>           
        </div>
    <script type="text/javascript" charset="utf-8">
    
    $( document ).ready(function() """),format.raw/*161.36*/("""{"""),format.raw/*161.37*/("""

        var phones = $('.phone');
        var types = $('.numbertype');
        renumber(phones,types);
  
    """),format.raw/*167.5*/("""}"""),format.raw/*167.6*/(""");

    $('.addPhone').click(function() """),format.raw/*169.37*/("""{"""),format.raw/*169.38*/("""
            
            var template = $('.phone-template');
            $(this).before(template.html());

            var phones = $('.phone');
            var types = $('.numbertype');
            renumber(phones,types);
        """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/(""");

    $('body').on('click', '.removePhone', function(event) 
        """),format.raw/*180.9*/("""{"""),format.raw/*180.10*/(""" 
            $(this).parent().parent().remove(); 
            var phones = $('.phone');
            var types = $('.numbertype');
            renumber(phones,types); 
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/(""");


    var renumber = function(phones,types) """),format.raw/*188.43*/("""{"""),format.raw/*188.44*/("""

        phones.each(function(i) """),format.raw/*190.33*/("""{"""),format.raw/*190.34*/("""
                    $(this).attr('name', $(this).attr('name').replace(/phonenumbers\[.+\]/g, 'phonenumbers[' + i + ']'))
                    $(this).attr('id', $(this).attr('id').replace(/phonenumbers\[.+\]/g, 'phonenumbers[' + i + ']'))
                """),format.raw/*193.17*/("""}"""),format.raw/*193.18*/(""")

        types.each(function(i) """),format.raw/*195.32*/("""{"""),format.raw/*195.33*/("""
                    $(this).attr('name', $(this).attr('name').replace(/type\[.+\]/g, 'type[' + i + ']'))
                     $(this).attr('id', $(this).attr('id').replace(/type\[.+\]/g, 'type[' + i + ']'))
                """),format.raw/*198.17*/("""}"""),format.raw/*198.18*/(""")
    """),format.raw/*199.5*/("""}"""),format.raw/*199.6*/("""
    </script>
""")))})),format.raw/*201.2*/("""
"""))}
    }
    
    def render(contactForm:Form[Contact],contact:Contact): play.api.templates.HtmlFormat.Appendable = apply(contactForm)(contact)
    
    def f:((Form[Contact]) => (Contact) => play.api.templates.HtmlFormat.Appendable) = (contactForm) => (contact) => apply(contactForm)(contact)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 23 20:08:04 EDT 2014
                    SOURCE: /home/parth/Development/play-2.2.1/samples/java/computer-database/app/views/contact.scala.html
                    HASH: 506dcae3ab4cf09ab74abd9e55b6d85d3572a8cf
                    MATRIX: 791->1|930->153|948->163|1075->210|1115->216|1185->278|1248->304|1319->339|1345->343|1391->353|1418->358|1511->420|1544->68|1576->92|1662->47|1690->66|1718->148|1749->422|1789->427|1858->487|1897->488|1937->493|1951->499|1994->533|2034->535|2147->612|2163->619|2188->622|2296->694|2312->701|2343->710|2446->777|2462->784|2494->794|2537->802|2711->954|2762->969|2924->1109|2975->1124|3146->1273|3187->1279|3353->1423|3394->1429|3569->1582|3616->1593|3662->1630|3702->1632|3859->1753|4056->1928|4178->2014|4386->2200|4484->2280|4497->2285|4536->2286|4587->2301|4662->2360|4701->2361|4861->2485|5108->2710|5230->2796|5484->3028|5562->3069|5585->3082|5626->3084|5867->3292|5960->3352|6006->3365|6269->3591|6301->3613|6342->3615|6402->3638|6418->3644|6492->3695|6582->3752|6642->3775|6658->3781|6696->3796|6773->3841|6969->4000|7168->4176|7291->4262|7501->4449|7881->4800|7911->4801|8052->4914|8081->4915|8150->4955|8180->4956|8441->5189|8471->5190|8570->5261|8600->5262|8804->5438|8834->5439|8910->5486|8940->5487|9003->5521|9033->5522|9317->5777|9347->5778|9410->5812|9440->5813|9693->6037|9723->6038|9757->6044|9786->6045|9834->6061
                    LINES: 26->1|29->8|29->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|33->10|35->12|36->5|36->5|37->1|39->4|40->5|43->13|47->17|47->17|47->17|49->19|49->19|49->19|49->19|53->23|53->23|53->23|56->26|56->26|56->26|58->28|58->28|58->28|60->30|64->34|66->36|70->40|72->42|76->46|78->48|82->52|84->54|88->58|90->60|90->60|90->60|95->65|99->69|102->72|106->76|110->80|110->80|110->80|112->82|112->82|112->82|116->86|121->91|124->94|129->99|131->101|131->101|131->101|137->107|140->110|143->113|154->124|154->124|154->124|155->125|155->125|155->125|156->126|157->127|157->127|157->127|162->132|169->139|173->143|176->146|180->150|191->161|191->161|197->167|197->167|199->169|199->169|207->177|207->177|210->180|210->180|215->185|215->185|218->188|218->188|220->190|220->190|223->193|223->193|225->195|225->195|228->198|228->198|229->199|229->199|231->201
                    -- GENERATED --
                */
            