plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
}
dependencies {
  api("org.mockito:mockito-core:3.12.4")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
