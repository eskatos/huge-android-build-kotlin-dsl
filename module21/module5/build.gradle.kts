plugins {
  id("com.android.application")
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
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module554:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module379:module2"))
  implementation("androidx.core:core-ktx:1.7.0")
}
