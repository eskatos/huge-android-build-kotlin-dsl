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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module13:module05:module6"))
  api(project(":module13:module15"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module139"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module02:module5:module6"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module276:module4"))
  implementation(project(":module07:module277:module3"))
  implementation(project(":module07:module290:module3"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module403:module1:module5"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module26"))
  implementation(project(":module13:module06"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation(project(":module16:module052:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
