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
  api(project(":module05:module37:module2"))
  api(project(":module06:module17:module3"))
  api(project(":module07:module194"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module061:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module464:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}