// @SOURCE:/home/parth/Development/play-2.2.1/samples/java/computer-database/conf/routes
// @HASH:577b30d6244619df58b60079c5cf807ff15ce5ab
// @DATE:Fri Apr 18 17:24:02 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Dmdaid_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:15
private[this] lazy val controllers_Application_createUser4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/new"))))
        

// @LINE:16
private[this] lazy val controllers_Application_saveUser5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:19
private[this] lazy val controllers_Dmdaid_fam6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fam"))))
        

// @LINE:22
private[this] lazy val controllers_Dmdaid_care7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("care"))))
        

// @LINE:25
private[this] lazy val controllers_Dmdaid_acute8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("acute"))))
        

// @LINE:28
private[this] lazy val controllers_Neurology_neuroMeds9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("neurology/neuromeds"))))
        

// @LINE:29
private[this] lazy val controllers_Neurology_neuroMedsSave10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("neurology/neuromeds"))))
        

// @LINE:32
private[this] lazy val controllers_HealthRecords_neurologyHome11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("neurology"))))
        

// @LINE:33
private[this] lazy val controllers_HealthRecords_cardiologyHome12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cardiology"))))
        

// @LINE:34
private[this] lazy val controllers_HealthRecords_gastrointestinalHome13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("gastrointestinal"))))
        

// @LINE:35
private[this] lazy val controllers_HealthRecords_respiratoryHome14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("respiratory"))))
        

// @LINE:36
private[this] lazy val controllers_HealthRecords_musculoskeletalHome15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("musculoskeletal"))))
        

// @LINE:39
private[this] lazy val controllers_Dmdaid_contact16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact/new/"),DynamicPart("grp", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("rel", """[^/]+""",true))))
        

// @LINE:40
private[this] lazy val controllers_Dmdaid_saveContact17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:41
private[this] lazy val controllers_Dmdaid_deleteContact18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact/delete/"),DynamicPart("group", """[^/]+""",true),StaticPart("/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_Reports_showReportsTable19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/get/"),DynamicPart("category", """[^/]+""",true))))
        

// @LINE:45
private[this] lazy val controllers_Reports_newReport20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/new/"),DynamicPart("typ", """[^/]+""",true),StaticPart("/"),DynamicPart("category", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_Reports_showReport21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:47
private[this] lazy val controllers_Reports_deleteReport22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:48
private[this] lazy val controllers_Reports_pdfReportSave23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/pdfsave"))))
        

// @LINE:49
private[this] lazy val controllers_Reports_imgReportSave24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/imgsave"))))
        

// @LINE:52
private[this] lazy val controllers_Reports_getDirtyReports25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/dirty"))))
        

// @LINE:53
private[this] lazy val controllers_Reports_setReportClean26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/clean/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:62
private[this] lazy val controllers_Esm_getDailyEsm27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("esm"))))
        

// @LINE:63
private[this] lazy val controllers_Esm_esmResults28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("qol"))))
        

// @LINE:66
private[this] lazy val controllers_Medications_showMedications29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("medications/"),DynamicPart("type", """[^/]+""",true))))
        

// @LINE:67
private[this] lazy val controllers_Medications_saveMedication30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("medications/"),DynamicPart("type", """[^/]+""",true))))
        

// @LINE:68
private[this] lazy val controllers_Medications_deleteMedication31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("medication/del/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:69
private[this] lazy val controllers_Medications_getDirtyMedications32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("medication/dirty"))))
        

// @LINE:70
private[this] lazy val controllers_Medications_cleanDirtyMedications33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("medication/clean"))))
        

// @LINE:75
private[this] lazy val controllers_Assets_at34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Dmdaid.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/new""","""controllers.Application.createUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.saveUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fam""","""controllers.Dmdaid.fam()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """care""","""controllers.Dmdaid.care()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """acute""","""controllers.Dmdaid.acute()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """neurology/neuromeds""","""controllers.Neurology.neuroMeds()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """neurology/neuromeds""","""controllers.Neurology.neuroMedsSave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """neurology""","""controllers.HealthRecords.neurologyHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cardiology""","""controllers.HealthRecords.cardiologyHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gastrointestinal""","""controllers.HealthRecords.gastrointestinalHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """respiratory""","""controllers.HealthRecords.respiratoryHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """musculoskeletal""","""controllers.HealthRecords.musculoskeletalHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact/new/$grp<[^/]+>/$id<[^/]+>/$rel<[^/]+>""","""controllers.Dmdaid.contact(grp:String, id:Int, rel:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Dmdaid.saveContact()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact/delete/$group<[^/]+>/$id<[^/]+>""","""controllers.Dmdaid.deleteContact(group:String, id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/get/$category<[^/]+>""","""controllers.Reports.showReportsTable(category:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/new/$typ<[^/]+>/$category<[^/]+>""","""controllers.Reports.newReport(typ:String, category:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/show/$id<[^/]+>""","""controllers.Reports.showReport(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/delete/$id<[^/]+>""","""controllers.Reports.deleteReport(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/pdfsave""","""controllers.Reports.pdfReportSave()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/imgsave""","""controllers.Reports.imgReportSave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/dirty""","""controllers.Reports.getDirtyReports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/clean/$id<[^/]+>""","""controllers.Reports.setReportClean(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """esm""","""controllers.Esm.getDailyEsm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """qol""","""controllers.Esm.esmResults()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medications/$type<[^/]+>""","""controllers.Medications.showMedications(type:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medications/$type<[^/]+>""","""controllers.Medications.saveMedication(type:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medication/del/$id<[^/]+>""","""controllers.Medications.deleteMedication(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medication/dirty""","""controllers.Medications.getDirtyMedications()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medication/clean""","""controllers.Medications.cleanDirtyMedications()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Dmdaid_index0(params) => {
   call { 
        invokeHandler(controllers.Dmdaid.index(), HandlerDef(this, "controllers.Dmdaid", "index", Nil,"GET", """ Default path will just redirect to the computer list""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:15
case controllers_Application_createUser4(params) => {
   call { 
        invokeHandler(controllers.Application.createUser(), HandlerDef(this, "controllers.Application", "createUser", Nil,"GET", """ Add user """, Routes.prefix + """users/new"""))
   }
}
        

// @LINE:16
case controllers_Application_saveUser5(params) => {
   call { 
        invokeHandler(controllers.Application.saveUser(), HandlerDef(this, "controllers.Application", "saveUser", Nil,"POST", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:19
case controllers_Dmdaid_fam6(params) => {
   call { 
        invokeHandler(controllers.Dmdaid.fam(), HandlerDef(this, "controllers.Dmdaid", "fam", Nil,"GET", """ Family member and primary care giver information""", Routes.prefix + """fam"""))
   }
}
        

// @LINE:22
case controllers_Dmdaid_care7(params) => {
   call { 
        invokeHandler(controllers.Dmdaid.care(), HandlerDef(this, "controllers.Dmdaid", "care", Nil,"GET", """ Current Care guidelines""", Routes.prefix + """care"""))
   }
}
        

// @LINE:25
case controllers_Dmdaid_acute8(params) => {
   call { 
        invokeHandler(controllers.Dmdaid.acute(), HandlerDef(this, "controllers.Dmdaid", "acute", Nil,"GET", """ Acture care algorithm""", Routes.prefix + """acute"""))
   }
}
        

// @LINE:28
case controllers_Neurology_neuroMeds9(params) => {
   call { 
        invokeHandler(controllers.Neurology.neuroMeds(), HandlerDef(this, "controllers.Neurology", "neuroMeds", Nil,"GET", """ Neurology """, Routes.prefix + """neurology/neuromeds"""))
   }
}
        

// @LINE:29
case controllers_Neurology_neuroMedsSave10(params) => {
   call { 
        invokeHandler(controllers.Neurology.neuroMedsSave(), HandlerDef(this, "controllers.Neurology", "neuroMedsSave", Nil,"POST", """""", Routes.prefix + """neurology/neuromeds"""))
   }
}
        

// @LINE:32
case controllers_HealthRecords_neurologyHome11(params) => {
   call { 
        invokeHandler(controllers.HealthRecords.neurologyHome(), HandlerDef(this, "controllers.HealthRecords", "neurologyHome", Nil,"GET", """ Health Records""", Routes.prefix + """neurology"""))
   }
}
        

// @LINE:33
case controllers_HealthRecords_cardiologyHome12(params) => {
   call { 
        invokeHandler(controllers.HealthRecords.cardiologyHome(), HandlerDef(this, "controllers.HealthRecords", "cardiologyHome", Nil,"GET", """""", Routes.prefix + """cardiology"""))
   }
}
        

// @LINE:34
case controllers_HealthRecords_gastrointestinalHome13(params) => {
   call { 
        invokeHandler(controllers.HealthRecords.gastrointestinalHome(), HandlerDef(this, "controllers.HealthRecords", "gastrointestinalHome", Nil,"GET", """""", Routes.prefix + """gastrointestinal"""))
   }
}
        

// @LINE:35
case controllers_HealthRecords_respiratoryHome14(params) => {
   call { 
        invokeHandler(controllers.HealthRecords.respiratoryHome(), HandlerDef(this, "controllers.HealthRecords", "respiratoryHome", Nil,"GET", """""", Routes.prefix + """respiratory"""))
   }
}
        

// @LINE:36
case controllers_HealthRecords_musculoskeletalHome15(params) => {
   call { 
        invokeHandler(controllers.HealthRecords.musculoskeletalHome(), HandlerDef(this, "controllers.HealthRecords", "musculoskeletalHome", Nil,"GET", """""", Routes.prefix + """musculoskeletal"""))
   }
}
        

// @LINE:39
case controllers_Dmdaid_contact16(params) => {
   call(params.fromPath[String]("grp", None), params.fromPath[Int]("id", None), params.fromPath[String]("rel", None)) { (grp, id, rel) =>
        invokeHandler(controllers.Dmdaid.contact(grp, id, rel), HandlerDef(this, "controllers.Dmdaid", "contact", Seq(classOf[String], classOf[Int], classOf[String]),"GET", """ edit or create new contact""", Routes.prefix + """contact/new/$grp<[^/]+>/$id<[^/]+>/$rel<[^/]+>"""))
   }
}
        

// @LINE:40
case controllers_Dmdaid_saveContact17(params) => {
   call { 
        invokeHandler(controllers.Dmdaid.saveContact(), HandlerDef(this, "controllers.Dmdaid", "saveContact", Nil,"POST", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:41
case controllers_Dmdaid_deleteContact18(params) => {
   call(params.fromPath[String]("group", None), params.fromPath[Int]("id", None)) { (group, id) =>
        invokeHandler(controllers.Dmdaid.deleteContact(group, id), HandlerDef(this, "controllers.Dmdaid", "deleteContact", Seq(classOf[String], classOf[Int]),"GET", """""", Routes.prefix + """contact/delete/$group<[^/]+>/$id<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_Reports_showReportsTable19(params) => {
   call(params.fromPath[String]("category", None)) { (category) =>
        invokeHandler(controllers.Reports.showReportsTable(category), HandlerDef(this, "controllers.Reports", "showReportsTable", Seq(classOf[String]),"GET", """ create and veiew reports""", Routes.prefix + """reports/get/$category<[^/]+>"""))
   }
}
        

// @LINE:45
case controllers_Reports_newReport20(params) => {
   call(params.fromPath[String]("typ", None), params.fromPath[String]("category", None)) { (typ, category) =>
        invokeHandler(controllers.Reports.newReport(typ, category), HandlerDef(this, "controllers.Reports", "newReport", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """reports/new/$typ<[^/]+>/$category<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_Reports_showReport21(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Reports.showReport(id), HandlerDef(this, "controllers.Reports", "showReport", Seq(classOf[Int]),"GET", """""", Routes.prefix + """reports/show/$id<[^/]+>"""))
   }
}
        

// @LINE:47
case controllers_Reports_deleteReport22(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Reports.deleteReport(id), HandlerDef(this, "controllers.Reports", "deleteReport", Seq(classOf[Int]),"GET", """""", Routes.prefix + """reports/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:48
case controllers_Reports_pdfReportSave23(params) => {
   call { 
        invokeHandler(controllers.Reports.pdfReportSave(), HandlerDef(this, "controllers.Reports", "pdfReportSave", Nil,"POST", """""", Routes.prefix + """reports/pdfsave"""))
   }
}
        

// @LINE:49
case controllers_Reports_imgReportSave24(params) => {
   call { 
        invokeHandler(controllers.Reports.imgReportSave(), HandlerDef(this, "controllers.Reports", "imgReportSave", Nil,"POST", """""", Routes.prefix + """reports/imgsave"""))
   }
}
        

// @LINE:52
case controllers_Reports_getDirtyReports25(params) => {
   call { 
        invokeHandler(controllers.Reports.getDirtyReports(), HandlerDef(this, "controllers.Reports", "getDirtyReports", Nil,"GET", """mobile """, Routes.prefix + """reports/dirty"""))
   }
}
        

// @LINE:53
case controllers_Reports_setReportClean26(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Reports.setReportClean(id), HandlerDef(this, "controllers.Reports", "setReportClean", Seq(classOf[Int]),"GET", """""", Routes.prefix + """reports/clean/$id<[^/]+>"""))
   }
}
        

// @LINE:62
case controllers_Esm_getDailyEsm27(params) => {
   call { 
        invokeHandler(controllers.Esm.getDailyEsm(), HandlerDef(this, "controllers.Esm", "getDailyEsm", Nil,"GET", """ Daily ESMs""", Routes.prefix + """esm"""))
   }
}
        

// @LINE:63
case controllers_Esm_esmResults28(params) => {
   call { 
        invokeHandler(controllers.Esm.esmResults(), HandlerDef(this, "controllers.Esm", "esmResults", Nil,"GET", """""", Routes.prefix + """qol"""))
   }
}
        

// @LINE:66
case controllers_Medications_showMedications29(params) => {
   call(params.fromPath[String]("type", None)) { (playframework_escape_type) =>
        invokeHandler(controllers.Medications.showMedications(playframework_escape_type), HandlerDef(this, "controllers.Medications", "showMedications", Seq(classOf[String]),"GET", """ medications""", Routes.prefix + """medications/$type<[^/]+>"""))
   }
}
        

// @LINE:67
case controllers_Medications_saveMedication30(params) => {
   call(params.fromPath[String]("type", None)) { (playframework_escape_type) =>
        invokeHandler(controllers.Medications.saveMedication(playframework_escape_type), HandlerDef(this, "controllers.Medications", "saveMedication", Seq(classOf[String]),"POST", """""", Routes.prefix + """medications/$type<[^/]+>"""))
   }
}
        

// @LINE:68
case controllers_Medications_deleteMedication31(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Medications.deleteMedication(id), HandlerDef(this, "controllers.Medications", "deleteMedication", Seq(classOf[Int]),"GET", """""", Routes.prefix + """medication/del/$id<[^/]+>"""))
   }
}
        

// @LINE:69
case controllers_Medications_getDirtyMedications32(params) => {
   call { 
        invokeHandler(controllers.Medications.getDirtyMedications(), HandlerDef(this, "controllers.Medications", "getDirtyMedications", Nil,"GET", """""", Routes.prefix + """medication/dirty"""))
   }
}
        

// @LINE:70
case controllers_Medications_cleanDirtyMedications33(params) => {
   call { 
        invokeHandler(controllers.Medications.cleanDirtyMedications(), HandlerDef(this, "controllers.Medications", "cleanDirtyMedications", Nil,"GET", """""", Routes.prefix + """medication/clean"""))
   }
}
        

// @LINE:75
case controllers_Assets_at34(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     