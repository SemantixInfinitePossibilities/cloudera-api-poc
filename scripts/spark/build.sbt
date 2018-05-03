name := "Santander_Test"

version := "1.0"

scalaVersion := "2.10.5"

//resolvers += "Hadoop Releases" at "https://repository.cloudera.com/content/repositories/releases/"
//resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
//resolvers += "MavenRepository" at "https://mvnrepository.com/"
//resolvers += "ClouderaRepo" at "https://repository.cloudera.comgroups/cloudera-repos"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.1" % "provided"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
test in assembly := {}
assemblyJarName in assembly := "santander-1.0.jar"
