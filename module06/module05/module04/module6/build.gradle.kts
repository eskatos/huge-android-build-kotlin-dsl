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
  api(project(":module06:module04:module2"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module246"))
  api(project(":module07:module563:module1:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module127"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module399"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
