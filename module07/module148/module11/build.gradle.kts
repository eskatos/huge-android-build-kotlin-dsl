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
  api(project(":module07:module148:module03"))
  api(project(":module07:module148:module12"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.onetrust.cmp:native-sdk:6.17.0.0-jetified-2")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module464:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
