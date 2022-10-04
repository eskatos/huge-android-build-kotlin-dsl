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
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module340"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module02:module51:module3"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module41:module08:module2"))
  implementation(project(":module02:module41:module18:module1"))
  implementation(project(":module02:module41:module19:module3"))
  implementation(project(":module02:module41:module38:module2"))
  implementation(project(":module02:module47:module1"))
  implementation(project(":module02:module51:module2"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module132:module2"))
  implementation(project(":module07:module132:module5"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module201:module1"))
  implementation(project(":module07:module322:module04:module3"))
  implementation(project(":module07:module360:module2"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module501:module2"))
  implementation(project(":module07:module565:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
