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
  api(project(":module07:module041:module6"))
  api(project(":module07:module037:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module417:module3"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module042:module2"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module330:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.autofill:autofill:1.2.0-beta01")
  implementation("com.google.zxing:core:3.4.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module037:module1"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module380:module1"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("app.cash.paparazzi:paparazzi:1.0.0")
  testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
