plugins {
  id("java-library")
  id("java")
}
dependencies {
  api(project(":module16:module012:module1"))
  api(project(":module16:module011:module2"))
  api(project(":module16:module029:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module081:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
