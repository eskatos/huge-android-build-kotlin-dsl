plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
}
dependencies {
  api(project(":module07:module175:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
