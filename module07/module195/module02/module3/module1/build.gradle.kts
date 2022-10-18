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
  api(project(":module07:module006:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module02:module3:module3"))
  api(project(":module07:module342:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module511:module4"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module567:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module542:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
