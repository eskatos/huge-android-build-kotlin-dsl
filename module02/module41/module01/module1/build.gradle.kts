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
  api(project(":module02:module41:module02:module1"))
  api(project(":module02:module41:module01:module2"))
  api(project(":module02:module41:module10:module2"))
  api(project(":module02:module41:module17:module2"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module201:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module224:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module02:module41:module01:module3"))
  testImplementation(project(":module02:module41:module10:module3"))
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation(project(":module02:module41:module30:module3"))
  testImplementation(project(":module02:module41:module38:module4"))
  testImplementation(project(":module02:module49:module1"))
  testImplementation(project(":module07:module201:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
