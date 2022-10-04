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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module077:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module311"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module399"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module570"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module152:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}