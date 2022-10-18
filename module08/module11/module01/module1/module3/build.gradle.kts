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
  api(project(":module07:module175:module1"))
  api(project(":module07:module306:module4"))
  api(project(":module07:module369:module3"))
  api(project(":module07:module535:module3"))
  api(project(":module08:module12:module01:module5"))
  api(project(":module08:module12:module03:module3"))
  api(project(":module08:module11:module01:module1:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module371:module4"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module403:module1:module5"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module11:module04:module1"))
  implementation(project(":module08:module11:module05:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module08:module12:module05:module1"))
  testImplementation(project(":module08:module11:module03:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
