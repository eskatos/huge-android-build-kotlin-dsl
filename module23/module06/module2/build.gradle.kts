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
  androidTestImplementation(project(":module06:module05:module02:module2"))
  androidTestImplementation(project(":module06:module05:module05:module2"))
  androidTestImplementation(project(":module06:module05:module10:module2"))
  androidTestImplementation(project(":module06:module05:module12:module2"))
  androidTestImplementation(project(":module06:module05:module13:module2"))
  androidTestImplementation(project(":module06:module05:module15:module4"))
  androidTestImplementation(project(":module06:module05:module16:module2"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module06:module05:module23:module2"))
  androidTestImplementation(project(":module06:module05:module26:module2"))
  androidTestImplementation(project(":module06:module08:module2"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module07:module032:module5"))
  androidTestImplementation(project(":module07:module083:module2"))
  androidTestImplementation(project(":module07:module084:module2"))
  androidTestImplementation(project(":module07:module095:module4"))
  androidTestImplementation(project(":module07:module097:module3"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module304:module5"))
  androidTestImplementation(project(":module07:module307:module4"))
  androidTestImplementation(project(":module07:module302:module4"))
  androidTestImplementation(project(":module07:module404:module1:module2"))
  androidTestImplementation(project(":module07:module411:module4"))
  androidTestImplementation(project(":module07:module458:module3"))
  androidTestImplementation(project(":module07:module461:module3"))
  androidTestImplementation(project(":module07:module472:module2"))
  androidTestImplementation(project(":module07:module485:module5"))
  androidTestImplementation(project(":module07:module497:module2"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module15:module2"))
  androidTestImplementation(project(":module23:module01:module24"))
  androidTestImplementation(project(":module23:module01:module35"))
  androidTestImplementation(project(":module23:module01:module48"))
  androidTestImplementation(project(":module23:module06:module3:module1"))
  androidTestImplementation(project(":module23:module03:module08"))
  androidTestImplementation(project(":module23:module03:module10"))
  androidTestImplementation(project(":module24:module2:module2"))
  androidTestImplementation(project(":module24:module3:module2"))
  androidTestImplementation(project(":module24:module3:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module313:module3"))
  implementation(project(":module23:module01:module41"))
  implementation(project(":module23:module06:module3:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
