plugins {
  id("java-library")
  id("java")
}
dependencies {
  api(project(":module16:module011:module2"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
