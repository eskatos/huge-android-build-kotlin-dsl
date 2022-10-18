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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module074:module3"))
  api(project(":module07:module399"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module01"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module034"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module283:module5"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module554:module1"))
  implementation("androidx.activity:activity:1.3.1")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module01:module14"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
