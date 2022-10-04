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
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module17"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module379:module2"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module555"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module401"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
