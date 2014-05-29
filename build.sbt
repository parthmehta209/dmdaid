import play.Project._

name := "computer-database"

version := "1.0"

libraryDependencies ++= Seq( 
	javaJdbc, 
	javaEbean,
	"mysql" % "mysql-connector-java" % "5.1.21"
	)

playJavaSettings
