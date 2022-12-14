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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module02:module4"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module07:module194"))
  implementation(project(":module16:module012:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
