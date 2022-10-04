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
  api(project(":module07:module132:module6"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module193"))
  api(project(":module07:module282:module5"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module291:module1"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module335:module3"))
  api(project(":module07:module399"))
  api(project(":module07:module500:module4"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module562:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module09"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module566:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module237:module8"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
