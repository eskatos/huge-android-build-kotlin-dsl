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
  api(project(":module07:module175:module1"))
  api(project(":module07:module497:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module301:module4"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module399"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
