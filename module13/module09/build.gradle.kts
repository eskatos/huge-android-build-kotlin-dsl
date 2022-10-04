plugins {
  id("com.android.library")
  kotlin("android")
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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module298:module7"))
  implementation(project(":module07:module301:module4"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module497:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
}
