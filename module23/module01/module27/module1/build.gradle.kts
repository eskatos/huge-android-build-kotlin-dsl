plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module07:module301:module4"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module488:module4"))
  api(project(":module07:module497:module6"))
  api(project(":module23:module01:module27:module6"))
  api(project(":module23:module01:module27:module7"))
  api(project(":module23:module01:module51:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
