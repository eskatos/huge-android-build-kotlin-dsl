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
  api(project(":module05:module24:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module188:module2"))
  api(project(":module07:module547:module2"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module33:module4"))
  api(project(":module23:module01:module36:module6"))
  api(project(":module23:module01:module39:module1"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module01:module44:module1"))
  api(project(":module23:module01:module51:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
