plugins {
  id("java-library")
  id("java")
}
dependencies {
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
