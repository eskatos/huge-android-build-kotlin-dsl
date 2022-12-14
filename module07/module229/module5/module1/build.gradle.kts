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
  api(project(":module07:module229:module5:module3"))
  api("com.google.android.gms:play-services-tapandpay:17.0.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
