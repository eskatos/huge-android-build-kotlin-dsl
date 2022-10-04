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
  api(project(":module07:module178"))
  api(project(":module07:module195:module01:module3"))
  api(project(":module07:module195:module02:module4:module10"))
  api(project(":module07:module195:module04:module3"))
  api(project(":module07:module195:module05:module2:module1"))
  api(project(":module07:module195:module05:module3:module4"))
  api(project(":module07:module195:module09:module3"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module322:module04:module5"))
  api(project(":module07:module440:module5"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module561:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module195:module07:module4"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module322:module04:module6"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
