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
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module292:module3"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module25:module1:module1"))
  api(project(":module08:module25:module2:module3"))
  api(project(":module08:module25:module3:module3"))
  api(project(":module19:module1:module01:module3"))
  api(project(":module19:module1:module05:module3"))
  api(project(":module19:module1:module06:module1"))
  api(project(":module19:module1:module13:module1"))
  api(project(":module19:module2:module19:module3"))
  api(project(":module19:module2:module25:module1"))
  api(project(":module19:module2:module24:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module19:module1:module08:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module16:module066:module1"))
  testImplementation(project(":module19:module1:module05:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}