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
  api(project(":module07:module175:module1"))
  api(project(":module18:module01:module3"))
  api(project(":module18:module02:module2"))
  api(project(":module18:module04:module2:module2"))
  api(project(":module18:module11:module3:module1"))
  api(project(":module18:module12:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module05:module07"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module18:module12:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
