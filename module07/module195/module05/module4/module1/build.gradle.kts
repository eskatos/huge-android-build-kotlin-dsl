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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module091:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module05:module4:module4"))
  api(project(":module07:module195:module09:module3"))
  api(project(":module07:module399"))
  api(project(":module07:module562:module2"))
  api("com.google.android.material:material:1.2.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module165:module1"))
  implementation(project(":module07:module195:module01:module3"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module505:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
