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
  api(project(":module07:module237:module7"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module535:module3"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module07:module570"))
  implementation("androidx.recyclerview:recyclerview:1.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
