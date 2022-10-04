plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module561:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module549:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
