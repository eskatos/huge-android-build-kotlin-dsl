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
    buildConfig = true
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.ext:junit:1.1.3")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  api(project(":module07:module234:module1"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module07:module563:module2:module1"))
  api(project(":module07:module563:module3:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module549:module3"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module152:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
