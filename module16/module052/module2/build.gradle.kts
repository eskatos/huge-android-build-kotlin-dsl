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
  api(project(":module16:module052:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module401"))
  implementation(project(":module07:module411:module4"))
  implementation(project(":module07:module547:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
