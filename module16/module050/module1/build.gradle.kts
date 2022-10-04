plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api(project(":module16:module011:module2"))
  api(project(":module16:module031:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
