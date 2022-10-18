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
  api(project(":module05:module07"))
  api(project(":module05:module10:module3"))
  api(project(":module07:module098:module1"))
  api(project(":module18:module10:module3:module1"))
  api(project(":module18:module12:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module175:module1"))
  implementation(project(":module18:module11:module4:module2"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
