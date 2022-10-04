plugins {
  id("java-library")
  id("java")
}
dependencies {
  api(project(":module16:module025:module1"))
  api(project(":module16:module029:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module034:module1"))
  api(project(":module16:module068:module1"))
  api(project(":module16:module084:module1"))
  api(project(":module16:module095:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
