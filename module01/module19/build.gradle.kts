plugins {
  id("com.android.library")
  kotlin("android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module01:module18"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module097:module4"))
  implementation(project(":module07:module165:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module208:module8"))
  implementation(project(":module07:module221:module1:module7"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module569"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
