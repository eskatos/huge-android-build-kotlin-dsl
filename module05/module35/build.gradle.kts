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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module08:module2"))
  implementation(project(":module05:module21"))
  implementation(project(":module07:module046:module2"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module16:module012:module1"))
  implementation(project(":module16:module102:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
