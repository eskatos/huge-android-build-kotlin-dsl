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
    compose = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module151:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module322:module01:module1"))
  api(project(":module07:module322:module07:module2"))
  api(project(":module07:module320:module7"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module564:module1"))
  api(project(":module07:module565:module2"))
  api(project(":module07:module567:module2"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module322:module02:module2"))
  implementation(project(":module07:module322:module03:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module322:module03:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}