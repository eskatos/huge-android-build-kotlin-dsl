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
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api("androidx.webkit:webkit:1.3.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module565:module2"))
  implementation("androidx.activity:activity-compose:1.3.1")
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("androidx.compose.ui:ui:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
}
