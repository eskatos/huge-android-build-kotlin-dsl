plugins {
  id("java-library")
  id("java")
}
dependencies {
  api(project(":module16:module003:module1"))
  api(project(":module16:module004:module1"))
  api(project(":module16:module025:module1"))
  api(project(":module16:module026:module1"))
  api(project(":module16:module065:module1"))
  api(project(":module16:module068:module1"))
  api(project(":module16:module105:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
