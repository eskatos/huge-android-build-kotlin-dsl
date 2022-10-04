plugins {
  id("com.android.library")
  kotlin("android")
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
    androidResources = true
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module02:module41:module16:module3"))
  api(project(":module02:module41:module19:module4"))
  api(project(":module02:module41:module42:module1"))
  api(project(":module02:module48:module4"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module150:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module565:module2"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
