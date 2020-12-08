scalaVersion := "2.12.10"
name := "scala spark project template"
version := "1.0"

// libraryDependencies += groupID % artifactID % revision
// libraryDependencies += groupID % artifactID % revision % configuration
// spark
libraryDependencies +=  "org.apache.spark" %% "spark-sql" % "3.0.1"

// https://www.scalatest.org/install
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"