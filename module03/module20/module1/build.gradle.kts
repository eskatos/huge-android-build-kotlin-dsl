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
  androidTestImplementation(project(":module01:module12:module1"))
  androidTestImplementation(project(":module02:module02"))
  androidTestImplementation(project(":module02:module08:module4"))
  androidTestImplementation(project(":module02:module10:module1"))
  androidTestImplementation(project(":module02:module14:module3"))
  androidTestImplementation(project(":module02:module15:module2"))
  androidTestImplementation(project(":module02:module16:module3"))
  androidTestImplementation(project(":module02:module37:module3"))
  androidTestImplementation(project(":module02:module42:module1"))
  androidTestImplementation(project(":module03:module20:module5"))
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module06:module05:module03:module2"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module07:module094:module1"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module212:module4"))
  androidTestImplementation(project(":module07:module308:module2"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module333:module4"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module08:module06:module2"))
  androidTestImplementation(project(":module08:module11:module02:module3"))
  androidTestImplementation(project(":module08:module11:module11:module4"))
  androidTestImplementation(project(":module08:module11:module15:module2:module3"))
  androidTestImplementation(project(":module08:module11:module18:module2:module3"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module15:module2"))
  androidTestImplementation(project(":module23:module07:module32"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-contrib:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module20:module6"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module23:module01:module23"))
  implementation(project(":module23:module01:module32"))
  implementation(project(":module23:module01:module41"))
  implementation("com.bugsnag:bugsnag-android:5.0.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
