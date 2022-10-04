plugins {
  id("com.android.library")
  kotlin("android")
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
    buildConfig = false
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module09"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module500:module4"))
  api(project(":module23:module01:module33:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module24:module7"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module236:module3"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module570"))
  implementation(project(":module23:module01:module16"))
  implementation(project(":module23:module01:module31:module1"))
  implementation(project(":module23:module01:module42"))
  implementation(project(":module23:module01:module44:module3"))
  implementation(project(":module23:module01:module50"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
