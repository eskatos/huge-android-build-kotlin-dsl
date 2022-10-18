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
  api(project(":module06:module02:module3"))
  api(project(":module07:module218:module2"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module334:module1"))
  api(project(":module07:module415:module4"))
  api(project(":module07:module425:module1"))
  api(project(":module08:module26"))
  api(project(":module16:module052:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module139"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module270:module4"))
  implementation(project(":module07:module276:module4"))
  implementation(project(":module07:module277:module3"))
  implementation(project(":module07:module287:module1"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module410:module4"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module08:module26"))
  implementation(project(":module08:module27:module1"))
  implementation(project(":module08:module27:module3"))
  implementation(project(":module08:module52:module7"))
  implementation(project(":module13:module05:module6"))
  implementation(project(":module13:module03:module1:module3"))
  implementation(project(":module13:module15"))
  implementation(project(":module16:module085:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module16:module052:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
