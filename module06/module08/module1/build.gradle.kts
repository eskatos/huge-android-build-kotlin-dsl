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
  api(project(":module06:module04:module2"))
  api(project(":module06:module08:module4"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module16"))
  implementation(project(":module05:module37:module2"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module104"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
