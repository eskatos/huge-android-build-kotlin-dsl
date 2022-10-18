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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module07:module291:module1"))
  api(project(":module07:module497:module6"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module562:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module01"))
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module007:module3"))
  implementation(project(":module07:module009:module2"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module039:module6"))
  implementation(project(":module07:module041:module6"))
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module148:module12"))
  implementation(project(":module07:module151:module1"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module235:module1"))
  implementation(project(":module07:module285:module7"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module488:module4"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module554:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module037:module1"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
