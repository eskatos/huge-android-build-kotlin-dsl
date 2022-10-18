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
  api(project(":module05:module04:module1"))
  api(project(":module05:module11:module6"))
  api(project(":module05:module23:module5"))
  api(project(":module05:module25:module5"))
  api(project(":module05:module26:module4"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module07"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module05:module26:module5"))
  implementation(project(":module07:module224:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
