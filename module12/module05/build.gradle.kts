plugins {
  id("com.android.application")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module12:module02"))
  implementation(project(":module12:module03"))
  implementation(project(":module12:module06"))
  implementation(project(":module12:module07"))
  implementation(project(":module12:module09"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("com.google.android.gms:play-services-wallet:19.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation("junit:junit:4.13.2")
}
