plugins {
  id("com.android.application")
  kotlin("android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module311"))
  implementation(project(":module07:module570"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}