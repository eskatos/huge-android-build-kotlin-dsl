plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  androidTestImplementation(project(":module03:module16:module05"))
  androidTestImplementation(project(":module05:module36:module3"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module06:module05:module23:module2"))
  androidTestImplementation(project(":module06:module10:module1"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module07:module094:module1"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module195:module02:module5:module5"))
  androidTestImplementation(project(":module07:module208:module4"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module212:module4"))
  androidTestImplementation(project(":module07:module282:module4"))
  androidTestImplementation(project(":module07:module293:module2"))
  androidTestImplementation(project(":module07:module294:module4"))
  androidTestImplementation(project(":module07:module472:module2"))
  androidTestImplementation(project(":module07:module476:module3"))
  androidTestImplementation(project(":module07:module541:module1"))
  androidTestImplementation(project(":module08:module25:module5:module2"))
  androidTestImplementation(project(":module08:module38:module04:module5"))
  androidTestImplementation(project(":module08:module38:module05:module3"))
  androidTestImplementation(project(":module08:module38:module06:module2"))
  androidTestImplementation(project(":module08:module38:module07:module2"))
  androidTestImplementation(project(":module08:module38:module09:module2"))
  androidTestImplementation(project(":module08:module38:module13:module5"))
  androidTestImplementation(project(":module08:module40:module3"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module19:module2:module01:module3"))
  androidTestImplementation(project(":module19:module2:module02:module2"))
  androidTestImplementation(project(":module19:module2:module05:module2"))
  androidTestImplementation(project(":module19:module2:module04:module1"))
  androidTestImplementation(project(":module19:module2:module04:module3"))
  androidTestImplementation(project(":module19:module2:module08:module2"))
  androidTestImplementation(project(":module19:module2:module11:module2"))
  androidTestImplementation(project(":module19:module2:module14:module3"))
  androidTestImplementation(project(":module19:module2:module18:module5"))
  androidTestImplementation(project(":module19:module2:module19:module2"))
  androidTestImplementation(project(":module19:module2:module20:module3"))
  androidTestImplementation(project(":module19:module2:module22:module2"))
  androidTestImplementation(project(":module19:module2:module30:module2"))
  androidTestImplementation(project(":module19:module2:module31:module2"))
  androidTestImplementation(project(":module19:module2:module36:module2"))
  androidTestImplementation(project(":module19:module2:module37:module2"))
  androidTestImplementation(project(":module19:module2:module41:module2"))
  androidTestImplementation(project(":module19:module2:module43:module2"))
  androidTestImplementation(project(":module23:module01:module48"))
  androidTestImplementation(project(":module23:module03:module10"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module16:module06"))
  implementation(project(":module07:module313:module3"))
  implementation(project(":module19:module1:module25:module1"))
  implementation(project(":module23:module01:module41"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
