plugins {
  id("java-library")
  id("java")
}
dependencies {
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module16:module029:module1"))
  implementation(project(":module16:module031:module1"))
  implementation(project(":module16:module068:module1"))
}
