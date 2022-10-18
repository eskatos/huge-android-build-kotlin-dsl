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
  api(project(":module05:module02:module1"))
  api(project(":module05:module04:module1"))
  api(project(":module05:module04:module2"))
  api(project(":module05:module06:module4"))
  api(project(":module05:module06:module5"))
  api(project(":module05:module07"))
  api(project(":module05:module08:module1"))
  api(project(":module05:module10:module2"))
  api(project(":module05:module11:module6"))
  api(project(":module05:module12:module2"))
  api(project(":module05:module15:module1"))
  api(project(":module05:module14:module04"))
  api(project(":module05:module14:module14"))
  api(project(":module05:module21"))
  api(project(":module05:module25:module6"))
  api(project(":module05:module26:module3"))
  api(project(":module05:module32:module1"))
  api(project(":module05:module35"))
  api(project(":module05:module39:module3"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module251"))
  api(project(":module07:module445:module1"))
  api(project(":module07:module464:module6"))
  api(project(":module07:module468:module3"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module07"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
}
