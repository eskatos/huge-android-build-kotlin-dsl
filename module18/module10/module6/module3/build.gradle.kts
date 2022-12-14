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
  api(project(":module05:module21"))
  api(project(":module07:module395:module2"))
  api(project(":module07:module517:module3"))
  api(project(":module18:module10:module2:module2"))
  api(project(":module18:module10:module3:module1"))
  api(project(":module18:module11:module4:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
