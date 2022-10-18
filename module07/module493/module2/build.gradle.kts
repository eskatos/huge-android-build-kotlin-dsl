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
  api(project(":module07:module329:module1"))
  api("androidx.core:core-ktx:1.7.0")
  api("androidx.test:runner:1.4.0")
  api("com.facebook.testing.screenshot:core:0.8.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module542:module2"))
  implementation(project(":module26:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
