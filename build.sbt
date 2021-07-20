name := "dfdl-nitf-core"
 
organization := "com.tresys"
 
version := "0.0.1"
 
scalaVersion := "2.12.11"
 
libraryDependencies ++= Seq(
  "com.tresys" % "dfdl-nitf" % "0.0.1",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.2.0-SNAPSHOT" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
