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
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module13:module05:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module13:module05:module6"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module024:module3"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module091:module3"))
  implementation(project(":module07:module114:module1"))
  implementation(project(":module07:module125:module1"))
  implementation(project(":module07:module154:module3"))
  implementation(project(":module07:module154:module5"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module195:module02:module4:module02"))
  implementation(project(":module07:module195:module02:module5:module2"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module218:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module228:module2"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module270:module2"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module276:module2"))
  implementation(project(":module07:module277:module1"))
  implementation(project(":module07:module290:module1"))
  implementation(project(":module07:module290:module3"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module368:module4"))
  implementation(project(":module07:module388:module2"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module403:module1:module3"))
  implementation(project(":module07:module403:module2:module3"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module468:module2"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module1"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module08:module12:module02:module2:module1"))
  implementation(project(":module08:module12:module11:module1"))
  implementation(project(":module08:module11:module01:module7:module2"))
  implementation(project(":module08:module11:module01:module7:module3"))
  implementation(project(":module08:module11:module12:module2"))
  implementation(project(":module08:module11:module16:module2"))
  implementation(project(":module08:module11:module15:module2:module2"))
  implementation(project(":module08:module11:module15:module3:module2"))
  implementation(project(":module08:module27:module3"))
  implementation(project(":module13:module05:module2"))
  implementation(project(":module13:module05:module5"))
  implementation(project(":module13:module16"))
  implementation(project(":module13:module18:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
