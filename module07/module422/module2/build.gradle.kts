plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
