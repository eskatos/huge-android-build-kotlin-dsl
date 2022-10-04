plugins {
  id("com.android.application")
  kotlin("android")
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
  androidTestImplementation(project(":module03:module17:module05"))
  androidTestImplementation(project(":module05:module30:module6"))
  androidTestImplementation(project(":module05:module34:module5"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module07:module023:module4:module3"))
  androidTestImplementation(project(":module07:module066:module3"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module195:module02:module4:module05"))
  androidTestImplementation(project(":module07:module195:module02:module5:module5"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module284:module2"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module371:module2"))
  androidTestImplementation(project(":module07:module472:module2"))
  androidTestImplementation(project(":module07:module476:module3"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module08:module14:module3"))
  androidTestImplementation(project(":module08:module19:module2"))
  androidTestImplementation(project(":module08:module41:module4"))
  androidTestImplementation(project(":module08:module62:module3"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module15:module2"))
  androidTestImplementation(project(":module20:module1:module5:module1"))
  androidTestImplementation(project(":module20:module2:module01:module2"))
  androidTestImplementation(project(":module20:module2:module06:module2"))
  androidTestImplementation(project(":module20:module2:module08:module4"))
  androidTestImplementation(project(":module20:module2:module13:module2"))
  androidTestImplementation(project(":module20:module2:module15:module2"))
  androidTestImplementation(project(":module20:module2:module18:module3"))
  androidTestImplementation(project(":module20:module3:module2"))
  androidTestImplementation(project(":module23:module03:module11"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-contrib:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module17:module06"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module23:module01:module23"))
  implementation(project(":module23:module01:module32"))
  implementation(project(":module23:module01:module41"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
