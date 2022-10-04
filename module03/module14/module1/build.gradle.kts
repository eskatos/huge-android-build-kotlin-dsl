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
    buildConfig = false
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module14:module2"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module443:module1"))
  implementation(project(":module07:module518:module07"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module07:module546:module1"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.code.gson:gson:2.8.6")
  implementation("com.jakewharton.rxbinding2:rxbinding-kotlin:2.2.0")
  implementation("com.jakewharton.rxbinding2:rxbinding:2.2.0")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
