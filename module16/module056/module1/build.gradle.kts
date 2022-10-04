plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
