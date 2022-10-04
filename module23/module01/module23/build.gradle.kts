plugins {
  id("com.android.library")
  kotlin("android")
  id("org.jetbrains.kotlin.kapt")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module07:module083:module7"))
  api(project(":module10:module2"))
  api(project(":module23:module01:module32"))
  api("com.google.dagger:dagger:2.39.1")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module19"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module478:module4"))
  implementation(project(":module07:module476:module4"))
  implementation(project(":module23:module01:module02:module3"))
  implementation(project(":module23:module01:module17:module1"))
  implementation(project(":module23:module01:module31:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
