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
  api(project(":module07:module233:module1"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module16:module067:module1"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module269"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module311"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
