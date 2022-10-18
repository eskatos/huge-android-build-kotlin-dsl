plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module01:module12:module3"))
  api(project(":module01:module13"))
  api(project(":module05:module04:module2"))
  api(project(":module05:module11:module6"))
  api(project(":module05:module14:module14"))
  api(project(":module05:module21"))
  api(project(":module05:module35"))
  api(project(":module05:module39:module3"))
  api(project(":module07:module157:module2"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module07"))
  implementation(project(":module05:module25:module6"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module433"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module16:module012:module1"))
  implementation(project(":module16:module103:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module05:module05"))
  testImplementation(project(":module07:module098:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
