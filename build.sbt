lazy val root = (project in file("."))
  .settings(name := "test-g8")
  .aggregate(`project-1`, `project-2`)

lazy val `project-1` = project.settings(name := "project-1")
lazy val `project-2` = project.settings(name := "project-2")
