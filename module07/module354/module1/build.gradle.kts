plugins {
  id("com.android.application")
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
    buildConfig = true
    compose = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module354:module3"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module354:module4"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module036:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module179:module2"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module204:module1"))
  implementation(project(":module07:module264:module5"))
  implementation(project(":module07:module332:module1"))
  implementation(project(":module07:module332:module2"))
  implementation(project(":module07:module335:module2"))
  implementation(project(":module07:module354:module2"))
  implementation(project(":module07:module552:module1"))
  implementation(project(":module07:module565:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
