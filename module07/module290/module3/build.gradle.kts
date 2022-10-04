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
  api(project(":module07:module235:module1"))
  api(project(":module07:module311"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module557"))
  api(project(":module07:module562:module2"))
  api(project(":module16:module068:module1"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module379:module2"))
  implementation(project(":module07:module542:module2"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
