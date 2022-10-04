plugins {
  id("com.android.application")
  kotlin("android")
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
  androidTestImplementation(project(":module03:module03:module05"))
  androidTestImplementation(project(":module03:module03:module08"))
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module07:module050:module4"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module195:module02:module5:module5"))
  androidTestImplementation(project(":module07:module262:module2"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module327:module3"))
  androidTestImplementation(project(":module07:module333:module4"))
  androidTestImplementation(project(":module07:module351:module4"))
  androidTestImplementation(project(":module07:module410:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module08:module28:module3"))
  androidTestImplementation(project(":module08:module52:module5"))
  androidTestImplementation(project(":module10:module4"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module13:module05:module4"))
  androidTestImplementation(project(":module13:module03:module1:module2"))
  androidTestImplementation(project(":module13:module08:module2"))
  androidTestImplementation(project(":module13:module16"))
  androidTestImplementation(project(":module15:module2"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-contrib:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  api(project(":module03:module03:module06"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module313:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
