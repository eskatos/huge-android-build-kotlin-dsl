plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api(project(":module16:module028:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("org.threeten:threetenbp:1.6.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
