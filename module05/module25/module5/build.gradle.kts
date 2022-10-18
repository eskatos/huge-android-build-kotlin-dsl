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
  api(project(":module05:module25:module2"))
  api(project(":module05:module25:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module23:module9"))
  implementation(project(":module05:module25:module3"))
  implementation(project(":module05:module35"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module518:module10"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
