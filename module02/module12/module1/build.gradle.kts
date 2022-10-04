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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module02:module15:module4"))
  api(project(":module02:module30:module1:module2"))
  api(project(":module02:module41:module07:module3"))
  api(project(":module02:module41:module16:module3"))
  api(project(":module02:module48:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module328:module1"))
  api(project(":module08:module52:module7"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
