plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module05:module01:module3"))
  api(project(":module05:module06:module1"))
  api(project(":module05:module06:module5"))
  api(project(":module05:module09:module4"))
  api(project(":module05:module12:module1"))
  api(project(":module05:module22"))
  api(project(":module07:module099"))
  api(project(":module07:module194"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module12:module1"))
  implementation(project(":module05:module07"))
  implementation(project(":module05:module12:module1"))
  implementation(project(":module05:module14:module05"))
  implementation(project(":module05:module14:module11"))
  implementation(project(":module05:module23:module9"))
  implementation(project(":module05:module25:module6"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module433"))
  implementation(project(":module07:module455:module4"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module467:module1"))
  implementation(project(":module16:module061:module1"))
  implementation("com.google.code.gson:gson:2.8.6")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
