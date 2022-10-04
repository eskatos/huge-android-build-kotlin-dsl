plugins {
  id("com.android.application")
  kotlin("android")
  id("org.jetbrains.kotlin.kapt")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module13"))
  implementation(project(":module03:module25:module2"))
  implementation(project(":module05:module04:module1"))
  implementation(project(":module05:module14:module11"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module05:module22"))
  implementation(project(":module05:module23:module8"))
  implementation(project(":module05:module25:module4"))
  implementation(project(":module05:module39:module2"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module518:module03"))
  implementation(project(":module07:module518:module07"))
  implementation(project(":module07:module518:module09"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module23:module01:module08:module3"))
  implementation(project(":module23:module01:module29"))
  implementation(project(":module23:module01:module39:module1"))
  implementation(project(":module23:module01:module39:module2"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.lifecycle:lifecycle-reactivestreams-ktx:2.4.0")
  implementation("com.google.code.gson:gson:2.8.6")
  implementation("com.google.zxing:core:3.4.1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
