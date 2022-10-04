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
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module527"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module20:module2:module10:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module258:module3"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module20:module1:module1:module4"))
  implementation(project(":module20:module1:module5:module1"))
  implementation(project(":module20:module1:module6:module1"))
  implementation(project(":module20:module1:module7:module1"))
  implementation(project(":module20:module2:module04:module1"))
  implementation(project(":module20:module2:module12:module7"))
  implementation(project(":module20:module2:module17:module3"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
