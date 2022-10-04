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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module478:module4"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
