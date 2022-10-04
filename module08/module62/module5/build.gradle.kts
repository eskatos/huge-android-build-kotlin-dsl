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
  api(project(":module07:module399"))
  api(project(":module07:module562:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module061:module1"))
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module4:module4"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}