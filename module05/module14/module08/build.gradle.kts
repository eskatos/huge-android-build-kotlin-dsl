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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module05:module12:module2"))
  api(project(":module05:module16:module1"))
  api(project(":module05:module14:module05"))
  api(project(":module05:module14:module11"))
  api(project(":module05:module14:module14"))
  api(project(":module05:module22"))
  api(project(":module05:module23:module9"))
  api(project(":module06:module07:module4"))
  api(project(":module07:module099"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module194"))
  api(project(":module07:module328:module1"))
  api(project(":module07:module433"))
  api(project(":module07:module463:module2"))
  api(project(":module16:module103:module1"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
}