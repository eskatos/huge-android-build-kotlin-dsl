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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module246"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module19:module5:module9"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
