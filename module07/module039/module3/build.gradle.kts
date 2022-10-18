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
  api(project(":module07:module039:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module040:module5"))
  implementation(project(":module07:module042:module2"))
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module237:module7"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module485:module7"))
  implementation(project(":module07:module566:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module039:module2"))
  testImplementation(project(":module07:module237:module8"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module380:module1"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("app.cash.paparazzi:paparazzi:1.0.0")
  testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
