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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module06:module07:module4"))
  api(project(":module06:module16:module07"))
  api(project(":module06:module16:module10"))
  api(project(":module06:module16:module12"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module127"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module418"))
  api(project(":module07:module518:module10"))
  api(project(":module08:module41:module6"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
