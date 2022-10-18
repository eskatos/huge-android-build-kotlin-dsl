plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
}
dependencies {
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("io.reactivex.rxjava2:rxjava:2.2.20")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
