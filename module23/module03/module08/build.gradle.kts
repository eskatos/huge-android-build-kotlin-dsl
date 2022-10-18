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
  api(project(":module07:module472:module2"))
  api(project(":module07:module538:module1"))
  api(project(":module10:module4"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module23:module03:module07"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
