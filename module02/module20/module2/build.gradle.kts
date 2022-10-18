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
  api(project(":module02:module20:module4"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module517:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module13:module4"))
  implementation(project(":module02:module41:module18:module2"))
  implementation(project(":module02:module41:module27:module2"))
  implementation(project(":module02:module41:module38:module3"))
  implementation(project(":module02:module41:module41:module3"))
  implementation(project(":module07:module006:module1"))
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module035:module2"))
  implementation(project(":module07:module132:module6"))
  implementation(project(":module07:module147:module8"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module339:module4"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module16:module004:module1"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation(project(":module02:module41:module38:module4"))
  testImplementation(project(":module02:module41:module40:module1"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
