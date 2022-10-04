plugins {
  id("com.android.library")
  kotlin("android")
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
    buildConfig = false
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module500:module4"))
  implementation(project(":module23:module01:module36:module7"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module250"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
