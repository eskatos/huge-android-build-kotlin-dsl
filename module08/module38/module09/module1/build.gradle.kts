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
  api(project(":module07:module175:module1"))
  api(project(":module08:module38:module09:module5"))
  api(project(":module08:module38:module09:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
