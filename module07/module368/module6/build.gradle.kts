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
  api(project(":module07:module150:module2"))
  api(project(":module07:module235:module1"))
  api(project(":module16:module061:module1"))
  api(project(":module16:module068:module1"))
  api(project(":module16:module095:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module35"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module132:module6"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module191"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
