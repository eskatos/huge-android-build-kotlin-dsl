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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module132:module6"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module527"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module20:module2:module07:module2"))
  api(project(":module20:module2:module11:module4"))
  api(project(":module20:module2:module13:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module248:module1"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module05:module5"))
  implementation(project(":module20:module1:module1:module4"))
  implementation(project(":module20:module1:module5:module1"))
  implementation(project(":module20:module2:module04:module1"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module20:module1:module2:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}