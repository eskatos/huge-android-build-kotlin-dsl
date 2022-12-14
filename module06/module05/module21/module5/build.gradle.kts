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
  api(project(":module06:module17:module3"))
  api(project(":module07:module090:module7"))
  api(project(":module07:module099"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module387:module2"))
  api(project(":module07:module466:module1"))
  api(project(":module07:module563:module2:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
