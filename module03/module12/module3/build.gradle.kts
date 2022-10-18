plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module05:module24:module7"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module518:module03"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module569"))
  api(project(":module07:module570"))
  api(project(":module23:module01:module16"))
  api(project(":module23:module01:module36:module7"))
  api(project(":module23:module01:module39:module2"))
  api(project(":module23:module01:module42"))
  api(project(":module23:module01:module50"))
  api(project(":module23:module01:module53"))
  api(project(":module23:module01:module54"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module12:module2"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module313:module3"))
  implementation(project(":module07:module488:module4"))
  implementation(project(":module07:module518:module09"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module23:module01:module26:module1"))
  implementation(project(":module23:module01:module31:module1"))
  implementation(project(":module23:module01:module41"))
  implementation(project(":module23:module01:module45"))
  implementation(project(":module23:module01:module51:module3"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("androidx.lifecycle:lifecycle-process:2.4.0")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
