plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
}
dependencies {
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
