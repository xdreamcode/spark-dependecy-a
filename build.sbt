name := "spark-dependecy-a"

version := "0.1"

scalaVersion := "2.11.12"

publishTo := Some("Xavier Nexus" at "http://35.168.35.94:8081/repository/maven-releases/")
credentials += Credentials("Sonatype Nexus Repository Manager", "35.168.35.94", "admin", "admin123")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
