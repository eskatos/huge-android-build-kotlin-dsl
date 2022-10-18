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
  api(project(":module07:module399"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module562:module2"))
  api(project(":module08:module11:module11:module7"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module126:module3"))
  implementation(project(":module07:module305:module3"))
  implementation(project(":module08:module12:module01:module5"))
  implementation(project(":module08:module12:module02:module1:module3"))
  implementation(project(":module08:module12:module02:module2:module3"))
  implementation(project(":module08:module12:module07:module3"))
  implementation(project(":module08:module12:module12:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
