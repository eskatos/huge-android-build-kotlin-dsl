plugins {
  id("java-library")
  id("java")
}
dependencies {
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
