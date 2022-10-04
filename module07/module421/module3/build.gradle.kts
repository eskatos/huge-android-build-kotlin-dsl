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
  api(project(":module01:module16"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module032:module7"))
  api(project(":module07:module082:module2"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module385:module2"))
  api(project(":module07:module421:module6"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module534:module1"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module046:module2"))
  implementation(project(":module07:module132:module6"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module283:module5"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module379:module2"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module478:module4"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module567:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module421:module2"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
