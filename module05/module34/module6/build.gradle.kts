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
  api(project(":module05:module34:module3"))
  api(project(":module05:module34:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module518:module10"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module3"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module546:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
