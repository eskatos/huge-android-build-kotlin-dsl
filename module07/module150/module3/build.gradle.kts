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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module150:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module542:module3"))
  implementation("androidx.fragment:fragment-ktx:1.3.6")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  implementation("org.mockito:mockito-core:3.12.4")
  testImplementation("androidx.appcompat:appcompat:1.3.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
}
