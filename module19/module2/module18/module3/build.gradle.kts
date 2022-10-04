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
  api(project(":module07:module025:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module183:module09"))
  api(project(":module07:module201:module1"))
  api(project(":module07:module258:module1"))
  api(project(":module19:module1:module11:module1"))
  api(project(":module19:module2:module18:module9"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module258:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
