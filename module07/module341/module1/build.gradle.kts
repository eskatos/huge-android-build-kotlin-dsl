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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module338:module1"))
  api("androidx.core:core-ktx:1.7.0")
  api("androidx.recyclerview:recyclerview:1.0.0")
  api("ca.barrenechea.header-decor:header-decor:0.3-cash01")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module542:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
