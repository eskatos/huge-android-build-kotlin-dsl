plugins {
  id("java-library")
  id("java")
}
dependencies {
  compileOnly("androidx.annotation:annotation:1.2.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
}
