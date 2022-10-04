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
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module293:module4"))
  androidTestImplementation(project(":module07:module522:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module20:module2:module09:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module080:module1"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module195:module01:module2"))
  implementation(project(":module07:module195:module02:module3:module2"))
  implementation(project(":module07:module195:module02:module4:module03"))
  implementation(project(":module07:module195:module02:module6:module1"))
  implementation(project(":module07:module195:module02:module7:module3"))
  implementation(project(":module07:module195:module03:module1"))
  implementation(project(":module07:module195:module05:module3:module1"))
  implementation(project(":module07:module195:module07:module2"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module270:module2"))
  implementation(project(":module07:module293:module3"))
  implementation(project(":module07:module292:module2"))
  implementation(project(":module07:module295:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module20:module2:module09:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
