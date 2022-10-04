plugins {
  id("com.android.library")
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
    buildConfig = false
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module119:module3"))
  implementation(project(":module07:module114:module2"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module557"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module16:module011:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("io.reactivex.rxjava2:rxjava:2.2.20")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
