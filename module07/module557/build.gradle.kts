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
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module07:module077:module7"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module240:module3"))
  api(project(":module07:module311"))
  api(project(":module07:module329:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module505:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module560:module1"))
  api(project(":module07:module570"))
  api("com.github.chrisbanes:PhotoView:2.3.0")
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module379:module2"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module555"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module466:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("androidx.test:runner:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
