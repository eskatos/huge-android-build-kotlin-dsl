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
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module175:module1"))
  api(project(":module20:module2:module09:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module023:module3:module2"))
  implementation(project(":module07:module023:module4:module4"))
  implementation(project(":module07:module080:module2"))
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module02:module7:module6"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module195:module07:module3"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module339:module4"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module08:module62:module5"))
  implementation(project(":module20:module1:module1:module4"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
