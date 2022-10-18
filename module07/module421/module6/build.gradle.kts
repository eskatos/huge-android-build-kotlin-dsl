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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module247:module2"))
  api(project(":module07:module399"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module034:module1"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module379:module2"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module542:module2"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
