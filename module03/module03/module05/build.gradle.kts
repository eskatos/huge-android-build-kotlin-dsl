plugins {
  id("com.android.library")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(30)
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module03:module03:module03"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module03:module03:module07"))
  compileOnly(project(":module07:module070"))
  compileOnly(project(":module07:module175:module1"))
  compileOnly(project(":module07:module383:module3"))
  compileOnly(project(":module07:module471"))
  compileOnly(project(":module07:module474"))
  compileOnly(project(":module08:module07"))
  compileOnly(project(":module08:module37"))
  compileOnly(project(":module13:module01"))
  compileOnly(project(":module13:module06"))
  compileOnly(project(":module13:module08:module3"))
  compileOnly(project(":module13:module09"))
  compileOnly(project(":module13:module10"))
  compileOnly(project(":module13:module11"))
  compileOnly(project(":module13:module12"))
  compileOnly(project(":module13:module15"))
  compileOnly(project(":module13:module17"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module03:module06"))
  implementation(project(":module13:module16"))
  implementation(project(":module15:module2"))
}
