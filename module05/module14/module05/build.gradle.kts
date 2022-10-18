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
  api(project(":module05:module07"))
  api(project(":module05:module14:module14"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module12:module3"))
  implementation(project(":module05:module17:module1"))
  implementation(project(":module05:module14:module04"))
  implementation(project(":module05:module22"))
  implementation(project(":module05:module23:module9"))
  implementation(project(":module05:module25:module6"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module433"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module568:module1"))
  implementation(project(":module16:module011:module2"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module05:module05"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
