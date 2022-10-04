plugins {
  id("java-library")
  id("java")
}
dependencies {
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
}
