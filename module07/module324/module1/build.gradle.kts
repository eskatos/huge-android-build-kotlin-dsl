plugins {
  id("java-library")
  id("java")
}
dependencies {
  api("org.mockito:mockito-core:3.12.4")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
