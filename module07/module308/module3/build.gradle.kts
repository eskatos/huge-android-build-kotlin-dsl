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
  api(project(":module07:module016:module5"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module470:module3"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module022:module6:module5"))
  implementation(project(":module07:module022:module5:module5"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module306:module4"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module476:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
