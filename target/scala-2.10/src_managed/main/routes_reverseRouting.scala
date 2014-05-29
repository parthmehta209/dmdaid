// @SOURCE:/home/parth/Development/play-2.2.1/samples/java/computer-database/conf/routes
// @HASH:577b30d6244619df58b60079c5cf807ff15ce5ab
// @DATE:Fri Apr 18 17:24:02 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:63
// @LINE:62
class ReverseEsm {
    

// @LINE:63
def esmResults(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "qol")
}
                                                

// @LINE:62
def getDailyEsm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "esm")
}
                                                
    
}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:6
class ReverseDmdaid {
    

// @LINE:19
def fam(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "fam")
}
                                                

// @LINE:25
def acute(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "acute")
}
                                                

// @LINE:39
def contact(grp:String, id:Int, rel:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact/new/" + implicitly[PathBindable[String]].unbind("grp", dynamicString(grp)) + "/" + implicitly[PathBindable[Int]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("rel", dynamicString(rel)))
}
                                                

// @LINE:41
def deleteContact(group:String, id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact/delete/" + implicitly[PathBindable[String]].unbind("group", dynamicString(group)) + "/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:22
def care(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "care")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:40
def saveContact(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "contact")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseReports {
    

// @LINE:44
def showReportsTable(category:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/get/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
}
                                                

// @LINE:45
def newReport(typ:String, category:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/new/" + implicitly[PathBindable[String]].unbind("typ", dynamicString(typ)) + "/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
}
                                                

// @LINE:47
def deleteReport(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/delete/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:53
def setReportClean(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/clean/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:46
def showReport(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/show/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:52
def getDirtyReports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/dirty")
}
                                                

// @LINE:48
def pdfReportSave(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reports/pdfsave")
}
                                                

// @LINE:49
def imgReportSave(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reports/imgsave")
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:15
def createUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/new")
}
                                                

// @LINE:16
def saveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseMedications {
    

// @LINE:70
def cleanDirtyMedications(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "medication/clean")
}
                                                

// @LINE:69
def getDirtyMedications(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "medication/dirty")
}
                                                

// @LINE:66
def showMedications(playframework_escape_type:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "medications/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)))
}
                                                

// @LINE:67
def saveMedication(playframework_escape_type:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "medications/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)))
}
                                                

// @LINE:68
def deleteMedication(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "medication/del/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseHealthRecords {
    

// @LINE:34
def gastrointestinalHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "gastrointestinal")
}
                                                

// @LINE:32
def neurologyHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "neurology")
}
                                                

// @LINE:36
def musculoskeletalHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "musculoskeletal")
}
                                                

// @LINE:33
def cardiologyHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cardiology")
}
                                                

// @LINE:35
def respiratoryHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "respiratory")
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
class ReverseNeurology {
    

// @LINE:28
def neuroMeds(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "neurology/neuromeds")
}
                                                

// @LINE:29
def neuroMedsSave(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "neurology/neuromeds")
}
                                                
    
}
                          
}
                  


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:63
// @LINE:62
class ReverseEsm {
    

// @LINE:63
def esmResults : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Esm.esmResults",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qol"})
      }
   """
)
                        

// @LINE:62
def getDailyEsm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Esm.getDailyEsm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "esm"})
      }
   """
)
                        
    
}
              

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:6
class ReverseDmdaid {
    

// @LINE:19
def fam : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.fam",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fam"})
      }
   """
)
                        

// @LINE:25
def acute : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.acute",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "acute"})
      }
   """
)
                        

// @LINE:39
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.contact",
   """
      function(grp,id,rel) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact/new/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("grp", encodeURIComponent(grp)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rel", encodeURIComponent(rel))})
      }
   """
)
                        

// @LINE:41
def deleteContact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.deleteContact",
   """
      function(group,id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("group", encodeURIComponent(group)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def care : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.care",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "care"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:40
def saveContact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dmdaid.saveContact",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseReports {
    

// @LINE:44
def showReportsTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.showReportsTable",
   """
      function(category) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("category", encodeURIComponent(category))})
      }
   """
)
                        

// @LINE:45
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.newReport",
   """
      function(typ,category) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/new/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("typ", encodeURIComponent(typ)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("category", encodeURIComponent(category))})
      }
   """
)
                        

// @LINE:47
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.deleteReport",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/delete/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def setReportClean : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.setReportClean",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/clean/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def showReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.showReport",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/show/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:52
def getDirtyReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.getDirtyReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/dirty"})
      }
   """
)
                        

// @LINE:48
def pdfReportSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.pdfReportSave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/pdfsave"})
      }
   """
)
                        

// @LINE:49
def imgReportSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.imgReportSave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/imgsave"})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:15
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/new"})
      }
   """
)
                        

// @LINE:16
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseMedications {
    

// @LINE:70
def cleanDirtyMedications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Medications.cleanDirtyMedications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medication/clean"})
      }
   """
)
                        

// @LINE:69
def getDirtyMedications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Medications.getDirtyMedications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medication/dirty"})
      }
   """
)
                        

// @LINE:66
def showMedications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Medications.showMedications",
   """
      function(type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medications/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type))})
      }
   """
)
                        

// @LINE:67
def saveMedication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Medications.saveMedication",
   """
      function(type) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medications/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type))})
      }
   """
)
                        

// @LINE:68
def deleteMedication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Medications.deleteMedication",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medication/del/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseHealthRecords {
    

// @LINE:34
def gastrointestinalHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HealthRecords.gastrointestinalHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gastrointestinal"})
      }
   """
)
                        

// @LINE:32
def neurologyHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HealthRecords.neurologyHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "neurology"})
      }
   """
)
                        

// @LINE:36
def musculoskeletalHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HealthRecords.musculoskeletalHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "musculoskeletal"})
      }
   """
)
                        

// @LINE:33
def cardiologyHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HealthRecords.cardiologyHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cardiology"})
      }
   """
)
                        

// @LINE:35
def respiratoryHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HealthRecords.respiratoryHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "respiratory"})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
class ReverseNeurology {
    

// @LINE:28
def neuroMeds : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Neurology.neuroMeds",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "neurology/neuromeds"})
      }
   """
)
                        

// @LINE:29
def neuroMedsSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Neurology.neuroMedsSave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "neurology/neuromeds"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:63
// @LINE:62
class ReverseEsm {
    

// @LINE:63
def esmResults(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Esm.esmResults(), HandlerDef(this, "controllers.Esm", "esmResults", Seq(), "GET", """""", _prefix + """qol""")
)
                      

// @LINE:62
def getDailyEsm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Esm.getDailyEsm(), HandlerDef(this, "controllers.Esm", "getDailyEsm", Seq(), "GET", """ Daily ESMs""", _prefix + """esm""")
)
                      
    
}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:6
class ReverseDmdaid {
    

// @LINE:19
def fam(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.fam(), HandlerDef(this, "controllers.Dmdaid", "fam", Seq(), "GET", """ Family member and primary care giver information""", _prefix + """fam""")
)
                      

// @LINE:25
def acute(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.acute(), HandlerDef(this, "controllers.Dmdaid", "acute", Seq(), "GET", """ Acture care algorithm""", _prefix + """acute""")
)
                      

// @LINE:39
def contact(grp:String, id:Int, rel:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.contact(grp, id, rel), HandlerDef(this, "controllers.Dmdaid", "contact", Seq(classOf[String], classOf[Int], classOf[String]), "GET", """ edit or create new contact""", _prefix + """contact/new/$grp<[^/]+>/$id<[^/]+>/$rel<[^/]+>""")
)
                      

// @LINE:41
def deleteContact(group:String, id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.deleteContact(group, id), HandlerDef(this, "controllers.Dmdaid", "deleteContact", Seq(classOf[String], classOf[Int]), "GET", """""", _prefix + """contact/delete/$group<[^/]+>/$id<[^/]+>""")
)
                      

// @LINE:22
def care(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.care(), HandlerDef(this, "controllers.Dmdaid", "care", Seq(), "GET", """ Current Care guidelines""", _prefix + """care""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.index(), HandlerDef(this, "controllers.Dmdaid", "index", Seq(), "GET", """ Default path will just redirect to the computer list""", _prefix + """""")
)
                      

// @LINE:40
def saveContact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dmdaid.saveContact(), HandlerDef(this, "controllers.Dmdaid", "saveContact", Seq(), "POST", """""", _prefix + """contact""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseReports {
    

// @LINE:44
def showReportsTable(category:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.showReportsTable(category), HandlerDef(this, "controllers.Reports", "showReportsTable", Seq(classOf[String]), "GET", """ create and veiew reports""", _prefix + """reports/get/$category<[^/]+>""")
)
                      

// @LINE:45
def newReport(typ:String, category:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.newReport(typ, category), HandlerDef(this, "controllers.Reports", "newReport", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """reports/new/$typ<[^/]+>/$category<[^/]+>""")
)
                      

// @LINE:47
def deleteReport(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.deleteReport(id), HandlerDef(this, "controllers.Reports", "deleteReport", Seq(classOf[Int]), "GET", """""", _prefix + """reports/delete/$id<[^/]+>""")
)
                      

// @LINE:53
def setReportClean(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.setReportClean(id), HandlerDef(this, "controllers.Reports", "setReportClean", Seq(classOf[Int]), "GET", """""", _prefix + """reports/clean/$id<[^/]+>""")
)
                      

// @LINE:46
def showReport(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.showReport(id), HandlerDef(this, "controllers.Reports", "showReport", Seq(classOf[Int]), "GET", """""", _prefix + """reports/show/$id<[^/]+>""")
)
                      

// @LINE:52
def getDirtyReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.getDirtyReports(), HandlerDef(this, "controllers.Reports", "getDirtyReports", Seq(), "GET", """mobile """, _prefix + """reports/dirty""")
)
                      

// @LINE:48
def pdfReportSave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.pdfReportSave(), HandlerDef(this, "controllers.Reports", "pdfReportSave", Seq(), "POST", """""", _prefix + """reports/pdfsave""")
)
                      

// @LINE:49
def imgReportSave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.imgReportSave(), HandlerDef(this, "controllers.Reports", "imgReportSave", Seq(), "POST", """""", _prefix + """reports/imgsave""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:15
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createUser(), HandlerDef(this, "controllers.Application", "createUser", Seq(), "GET", """ Add user """, _prefix + """users/new""")
)
                      

// @LINE:16
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveUser(), HandlerDef(this, "controllers.Application", "saveUser", Seq(), "POST", """""", _prefix + """users""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseMedications {
    

// @LINE:70
def cleanDirtyMedications(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Medications.cleanDirtyMedications(), HandlerDef(this, "controllers.Medications", "cleanDirtyMedications", Seq(), "GET", """""", _prefix + """medication/clean""")
)
                      

// @LINE:69
def getDirtyMedications(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Medications.getDirtyMedications(), HandlerDef(this, "controllers.Medications", "getDirtyMedications", Seq(), "GET", """""", _prefix + """medication/dirty""")
)
                      

// @LINE:66
def showMedications(playframework_escape_type:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Medications.showMedications(playframework_escape_type), HandlerDef(this, "controllers.Medications", "showMedications", Seq(classOf[String]), "GET", """ medications""", _prefix + """medications/$type<[^/]+>""")
)
                      

// @LINE:67
def saveMedication(playframework_escape_type:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Medications.saveMedication(playframework_escape_type), HandlerDef(this, "controllers.Medications", "saveMedication", Seq(classOf[String]), "POST", """""", _prefix + """medications/$type<[^/]+>""")
)
                      

// @LINE:68
def deleteMedication(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Medications.deleteMedication(id), HandlerDef(this, "controllers.Medications", "deleteMedication", Seq(classOf[Int]), "GET", """""", _prefix + """medication/del/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseHealthRecords {
    

// @LINE:34
def gastrointestinalHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HealthRecords.gastrointestinalHome(), HandlerDef(this, "controllers.HealthRecords", "gastrointestinalHome", Seq(), "GET", """""", _prefix + """gastrointestinal""")
)
                      

// @LINE:32
def neurologyHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HealthRecords.neurologyHome(), HandlerDef(this, "controllers.HealthRecords", "neurologyHome", Seq(), "GET", """ Health Records""", _prefix + """neurology""")
)
                      

// @LINE:36
def musculoskeletalHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HealthRecords.musculoskeletalHome(), HandlerDef(this, "controllers.HealthRecords", "musculoskeletalHome", Seq(), "GET", """""", _prefix + """musculoskeletal""")
)
                      

// @LINE:33
def cardiologyHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HealthRecords.cardiologyHome(), HandlerDef(this, "controllers.HealthRecords", "cardiologyHome", Seq(), "GET", """""", _prefix + """cardiology""")
)
                      

// @LINE:35
def respiratoryHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HealthRecords.respiratoryHome(), HandlerDef(this, "controllers.HealthRecords", "respiratoryHome", Seq(), "GET", """""", _prefix + """respiratory""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
class ReverseNeurology {
    

// @LINE:28
def neuroMeds(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Neurology.neuroMeds(), HandlerDef(this, "controllers.Neurology", "neuroMeds", Seq(), "GET", """ Neurology """, _prefix + """neurology/neuromeds""")
)
                      

// @LINE:29
def neuroMedsSave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Neurology.neuroMedsSave(), HandlerDef(this, "controllers.Neurology", "neuroMedsSave", Seq(), "POST", """""", _prefix + """neurology/neuromeds""")
)
                      
    
}
                          
}
        
    