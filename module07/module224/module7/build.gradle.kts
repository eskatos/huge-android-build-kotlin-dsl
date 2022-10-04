plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api(project(":module07:module224:module6"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module447:module1"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
