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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module183:module10"))
  api(project(":module07:module541:module1"))
  api("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module183:module08"))
  implementation(project(":module07:module538:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
