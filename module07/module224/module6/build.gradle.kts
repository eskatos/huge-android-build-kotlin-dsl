plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
