plugins {
  id("java-library")
  id("java")
  kotlin("jvm")
}
dependencies {
  api(project(":module16:module011:module2"))
  api(project(":module16:module029:module1"))
  api(project(":module16:module039:module1"))
  api(project(":module16:module068:module1"))
  api(project(":module16:module081:module1"))
  compileOnly(project(":module25:module5:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
