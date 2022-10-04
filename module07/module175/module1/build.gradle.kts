plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
