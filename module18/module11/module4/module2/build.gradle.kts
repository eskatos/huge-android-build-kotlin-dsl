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
  api(project(":module05:module14:module14"))
  api(project(":module07:module143:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module188:module3"))
  api(project(":module07:module298:module7"))
  api(project(":module07:module464:module6"))
  api(project(":module16:module038:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module18:module10:module3:module1"))
  implementation(project(":module18:module12:module1"))
  implementation("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
