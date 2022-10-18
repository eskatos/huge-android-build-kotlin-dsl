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
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module19:module2:module22:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module127"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module08:module25:module2:module3"))
  implementation(project(":module19:module1:module05:module3"))
  implementation(project(":module19:module1:module06:module1"))
  implementation(project(":module19:module1:module10:module3"))
  implementation(project(":module19:module1:module15:module3"))
  implementation(project(":module19:module5:module1:module2"))
  implementation(project(":module19:module5:module8"))
  implementation(project(":module19:module5:module9"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
