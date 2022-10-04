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
  api(project(":module05:module06:module5"))
  api(project(":module05:module21"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module445:module1"))
  api(project(":module07:module501:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
