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
  }
}
dependencies {
  androidTestImplementation(project(":module05:module01:module3"))
  androidTestImplementation(project(":module05:module30:module6"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module05:module30:module9"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module2"))
  implementation(project(":module05:module06:module4"))
  implementation(project(":module05:module09:module1"))
  implementation(project(":module05:module30:module2"))
  implementation(project(":module05:module30:module3"))
  implementation(project(":module05:module31:module5"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module376:module1:module4"))
  implementation(project(":module07:module376:module1:module5"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module478:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
