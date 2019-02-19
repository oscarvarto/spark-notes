import Dependencies._
import microsites._

enablePlugins(MicrositesPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.oscarvarto",
      scalaVersion := "2.12.8",
      version      := "0.1.0"
    )),
    name := "spark-notes",
    micrositeName := "Spark Notes",
    micrositeDescription      := "Spark Notes",
    micrositeBaseUrl	        := "/spark-notes",
    micrositeDocumentationUrl := "/spark-notes/docs.html",
    micrositeStaticDirectory  := (resourceDirectory in Compile).value / "microsite" / "slides",
    micrositeAuthor           := "Oscar Vargas Torres",
    micrositeGitterChannel    := true,
    micrositeGitterChannelUrl := "oscarvarto/spark-notes",
    micrositeHomepage         := "https://oscarvarto.github.io/spark-notes",
    micrositeGithubOwner      := "oscarvarto",
    micrositeGithubRepo       := "spark-notes",
    micrositeHighlightLanguages ++= Seq("haskell", "fsharp", "scala", "python", "java", "csharp"),
    micrositeCDNDirectives    := CdnDirectives(
      jsList = List(
        "https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.5/MathJax.js?config=TeX-MML-AM_CHTML,https://oscarvarto.github.io/learning-scala/js/mathjax-config.js"
      )
    ),
    ghpagesBranch := "master",
    libraryDependencies += scalaTest % Test
  )
