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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module025:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module390:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module547:module3"))
  api(project(":module08:module12:module09:module4"))
  api(project(":module08:module12:module11:module3"))
  api(project(":module08:module11:module01:module7:module5"))
  api(project(":module08:module11:module03:module1"))
  api(project(":module08:module11:module12:module4"))
  api(project(":module08:module11:module14:module1:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module564:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module08:module11:module03:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
