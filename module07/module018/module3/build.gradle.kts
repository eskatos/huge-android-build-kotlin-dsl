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
    androidResources = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module022:module3:module5"))
  api(project(":module07:module016:module5"))
  api(project(":module07:module121:module5"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module563:module1:module1"))
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
