plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module152:module1"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module399"))
  api(project(":module07:module470:module3"))
  api(project(":module07:module476:module4"))
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
