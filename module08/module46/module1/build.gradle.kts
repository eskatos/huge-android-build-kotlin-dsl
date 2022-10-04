plugins {
  id("com.android.application")
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
  androidTestImplementation(project(":module07:module090:module5"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation(project(":module08:module46:module2"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module08:module46:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module077:module3"))
  implementation(project(":module07:module090:module2"))
  implementation(project(":module07:module118:module2"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module172:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module226:module3"))
  implementation(project(":module07:module240:module2"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module418"))
  implementation(project(":module07:module449:module2"))
  implementation(project(":module07:module450:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module1"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module557"))
  implementation(project(":module08:module46:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
