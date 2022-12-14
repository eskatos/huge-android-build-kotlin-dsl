plugins {
  id("com.android.application")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module023:module4:module3"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module284:module2"))
  androidTestImplementation(project(":module07:module339:module3"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation(project(":module07:module549:module4"))
  androidTestImplementation(project(":module08:module19:module2"))
  androidTestImplementation(project(":module08:module62:module3"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module08:module62:module5"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module19"))
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module167:module2"))
  implementation(project(":module07:module183:module07"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module195:module01:module2"))
  implementation(project(":module07:module195:module02:module3:module2"))
  implementation(project(":module07:module195:module02:module4:module03"))
  implementation(project(":module07:module195:module02:module5:module2"))
  implementation(project(":module07:module195:module03:module1"))
  implementation(project(":module07:module195:module05:module3:module1"))
  implementation(project(":module07:module195:module07:module1"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module213:module3"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module270:module2"))
  implementation(project(":module07:module284:module1"))
  implementation(project(":module07:module293:module3"))
  implementation(project(":module07:module292:module2"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module08:module19:module1"))
  implementation(project(":module08:module62:module4"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
