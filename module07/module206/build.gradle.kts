plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module07:module119:module2"))
  api(project(":module07:module151:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module288"))
  api(project(":module07:module290:module3"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module562:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module115:module2"))
  implementation(project(":module07:module114:module2"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module16:module069:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module312"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
