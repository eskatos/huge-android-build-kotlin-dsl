plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module07:module013:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module188:module2"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module522:module3"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module36:module6"))
  api(project(":module23:module01:module39:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}