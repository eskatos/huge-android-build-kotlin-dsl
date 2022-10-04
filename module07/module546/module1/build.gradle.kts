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
  api(project(":module07:module013:module4"))
  api(project(":module07:module094:module2"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module177:module1"))
  api(project(":module07:module201:module1"))
  api(project(":module07:module328:module1"))
  api(project(":module07:module446:module1"))
  api(project(":module07:module453:module1"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module568:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("androidx.core:core-ktx:1.7.0")
  api("androidx.legacy:legacy-support-core-utils:1.0.0")
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("com.jakewharton.timber:timber:4.6.1")
  api("io.reactivex.rxjava2:rxandroid:2.1.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module210:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
