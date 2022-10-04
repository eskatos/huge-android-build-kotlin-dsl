plugins {
  id("com.android.library")
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
  buildFeatures {
    buildConfig = false
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module01:module09"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module527"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module16:module061:module1"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
