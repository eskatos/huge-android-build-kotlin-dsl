plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
  id("org.jetbrains.kotlin.kapt")
}
dependencies {
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("com.google.auto.service:auto-service-annotations:1.0")
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module222:module1"))
  implementation(project(":module07:module286:module1"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module540:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.auto.service:auto-service:1.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
