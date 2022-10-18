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
  api(project(":module05:module08:module2"))
  api(project(":module07:module194"))
  api(project(":module07:module433"))
  api(project(":module07:module569"))
  api(project(":module16:module012:module1"))
  api(project(":module16:module103:module1"))
  api(project(":module23:module07:module02:module4"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
}
