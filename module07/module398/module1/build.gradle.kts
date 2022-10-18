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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module150:module2"))
  api(project(":module07:module368:module6"))
  api(project(":module07:module398:module3"))
  api(project(":module07:module441:module1"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module554:module1"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module536:module5"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
