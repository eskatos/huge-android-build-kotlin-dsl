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
  api(project(":module07:module086:module6"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module151:module1"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module269"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module399"))
  api(project(":module07:module566:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module14:module2:module2"))
  api(project(":module16:module067:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module022:module5:module5"))
  implementation(project(":module07:module016:module5"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module02:module7:module6"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module07:module3"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module295:module2"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module339:module4"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module420:module2"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module26:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module195:module07:module4"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation(project(":module14:module2:module3"))
  testImplementation("androidx.test:core:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
