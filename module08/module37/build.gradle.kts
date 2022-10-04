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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module258:module3"))
  api(project(":module07:module415:module4"))
  api(project(":module07:module460:module3"))
  api(project(":module07:module508"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module35"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module368:module2"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
