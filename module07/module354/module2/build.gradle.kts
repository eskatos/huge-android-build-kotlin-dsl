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
  api(project(":module07:module175:module1"))
  api(project(":module07:module354:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module138:module2"))
  implementation(project(":module07:module179:module5"))
  implementation(project(":module07:module202:module3"))
  implementation(project(":module07:module204:module2"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module332:module4"))
  implementation(project(":module07:module335:module3"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module552:module2"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module26:module4:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
