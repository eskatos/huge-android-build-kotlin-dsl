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
  api(project(":module20:module2:module08:module6"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module467:module4"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module20:module1:module1:module4"))
  implementation(project(":module20:module1:module3:module2"))
  implementation(project(":module20:module1:module5:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module20:module2:module08:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}