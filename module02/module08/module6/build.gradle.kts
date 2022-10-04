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
  api(project(":module02:module13:module4"))
  api(project(":module02:module22:module4"))
  api(project(":module02:module31:module4"))
  api(project(":module02:module41:module03:module2"))
  api(project(":module07:module035:module2"))
  api(project(":module07:module195:module02:module5:module6"))
  api(project(":module07:module339:module4"))
  api(project(":module07:module437:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module06:module3"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module3"))
  implementation(project(":module07:module066:module6"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
