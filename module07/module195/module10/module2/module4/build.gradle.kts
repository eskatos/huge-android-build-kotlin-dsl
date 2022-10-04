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
  api(project(":module01:module02"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module01:module3"))
  api(project(":module07:module195:module04:module3"))
  api(project(":module07:module195:module05:module3:module4"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module469:module2"))
  api(project(":module07:module470:module3"))
  api(project(":module07:module474"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module476:module4"))
  api(project(":module07:module557"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module471"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
