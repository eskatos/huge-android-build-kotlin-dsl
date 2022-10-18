plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module07:module188:module3"))
  api(project(":module07:module229:module9:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module027:module1"))
  implementation(project(":module07:module046:module2"))
  implementation(project(":module07:module079:module1"))
  implementation(project(":module07:module149:module2"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module163:module3"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module422:module2"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module509:module3"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module568:module1"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("com.bugsnag:bugsnag-android:5.0.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("com.jakewharton:process-phoenix:2.0.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
