plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
    compose = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module566:module2"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  api(project(":module07:module179:module5"))
  api(project(":module07:module563:module1:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module397:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module547:module3"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("androidx.compose.runtime:runtime-rxjava2:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
}
