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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module02:module41:module20:module1"))
  api(project(":module07:module447:module1"))
  api(project(":module07:module522:module4"))
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("javax.inject:javax.inject:1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.robolectric:robolectric:4.7.3")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
