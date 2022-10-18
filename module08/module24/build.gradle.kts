plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module01:module19"))
  api(project(":module07:module105"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module242:module4"))
  api(project(":module07:module245:module2"))
  api(project(":module07:module508"))
  api(project(":module07:module549:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("javax.inject:javax.inject:1")
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module208:module8"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module569"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
