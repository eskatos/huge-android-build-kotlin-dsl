plugins {
  id("com.android.application")
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
    buildConfig = true
    compose = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module221:module2:module4"))
  androidTestImplementation(project(":module07:module221:module3:module4"))
  androidTestImplementation(project(":module07:module411:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module221:module2:module5"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module04:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module221:module2:module2"))
  implementation(project(":module07:module221:module3:module1"))
  implementation(project(":module07:module221:module3:module2"))
  implementation(project(":module07:module221:module3:module5"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module415:module3"))
  implementation(project(":module07:module414:module1"))
  implementation(project(":module07:module417:module2"))
  implementation(project(":module07:module467:module4"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module548:module1"))
  implementation(project(":module07:module565:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
