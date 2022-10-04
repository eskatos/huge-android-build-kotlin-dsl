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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module05:module34:module7"))
  api(project(":module07:module175:module1"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module3"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module546:module1"))
  implementation("com.github.felHR85:UsbSerial:6.1.0-SQ")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("com.starmicronics:scale:1.1.0.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
