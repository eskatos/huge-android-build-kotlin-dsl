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
  api(project(":module06:module05:module04:module6"))
  api(project(":module06:module05:module23:module5"))
  api(project(":module06:module07:module4"))
  api(project(":module06:module08:module4"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module406:module4"))
  api(project(":module07:module461:module4"))
  api(project(":module07:module527"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module12:module3"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module221:module1:module7"))
  implementation(project(":module07:module304:module6"))
  implementation(project(":module07:module307:module5"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
