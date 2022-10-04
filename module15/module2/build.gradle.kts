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
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module07:module074:module2"))
  api(project(":module07:module186:module3"))
  api(project(":module07:module224:module5"))
  api(project(":module07:module257:module2"))
  api(project(":module07:module522:module3"))
  api(project(":module07:module538:module1"))
  api(project(":module09:module3"))
  api(project(":module15:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module471"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
