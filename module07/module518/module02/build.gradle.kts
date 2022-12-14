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
  api(project(":module07:module175:module1"))
  api(project(":module07:module518:module10"))
  api("com.google.dagger:dagger:2.39.1")
  api("junit:junit:4.13.2")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module518:module01"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module540:module1"))
  implementation("androidx.test:rules:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
