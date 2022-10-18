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
  api(project(":module05:module06:module5"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module163:module3"))
  api(project(":module07:module194"))
  api(project(":module07:module251"))
  api(project(":module07:module527"))
  api("com.mattprecious.telescope:telescope:2.2.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module554:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
