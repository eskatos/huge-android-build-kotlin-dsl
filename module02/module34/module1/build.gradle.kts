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
  api(project(":module02:module34:module4"))
  api(project(":module02:module41:module28:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module349:module1"))
  api(project(":module07:module349:module4"))
  api(project(":module07:module350:module09"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module523:module2"))
  api(project(":module07:module562:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module283:module5"))
  implementation(project(":module07:module554:module1"))
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
