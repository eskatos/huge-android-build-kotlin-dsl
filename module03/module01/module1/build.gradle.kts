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
  androidTestImplementation(project(":module02:module02"))
  androidTestImplementation(project(":module02:module08:module4"))
  androidTestImplementation(project(":module02:module09:module3"))
  androidTestImplementation(project(":module02:module10:module1"))
  androidTestImplementation(project(":module02:module13:module3"))
  androidTestImplementation(project(":module02:module14:module3"))
  androidTestImplementation(project(":module02:module15:module2"))
  androidTestImplementation(project(":module02:module16:module3"))
  androidTestImplementation(project(":module02:module21:module3"))
  androidTestImplementation(project(":module02:module22:module2"))
  androidTestImplementation(project(":module02:module28:module3"))
  androidTestImplementation(project(":module02:module30:module1:module1"))
  androidTestImplementation(project(":module02:module31:module3"))
  androidTestImplementation(project(":module02:module34:module2"))
  androidTestImplementation(project(":module02:module36:module5"))
  androidTestImplementation(project(":module02:module37:module3"))
  androidTestImplementation(project(":module02:module43:module2"))
  androidTestImplementation(project(":module02:module42:module1"))
  androidTestImplementation(project(":module02:module47:module3"))
  androidTestImplementation(project(":module03:module01:module5"))
  androidTestImplementation(project(":module06:module05:module03:module2"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module06:module05:module22:module2"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module06:module19:module2:module2"))
  androidTestImplementation(project(":module07:module077:module2"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module195:module02:module4:module05"))
  androidTestImplementation(project(":module07:module195:module02:module5:module5"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module212:module4"))
  androidTestImplementation(project(":module07:module262:module2"))
  androidTestImplementation(project(":module07:module293:module4"))
  androidTestImplementation(project(":module07:module308:module2"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module322:module05:module3"))
  androidTestImplementation(project(":module07:module322:module04:module4"))
  androidTestImplementation(project(":module07:module322:module08:module4"))
  androidTestImplementation(project(":module07:module322:module09:module2"))
  androidTestImplementation(project(":module07:module333:module4"))
  androidTestImplementation(project(":module07:module351:module4"))
  androidTestImplementation(project(":module07:module436:module4"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module08:module06:module2"))
  androidTestImplementation(project(":module08:module11:module01:module1:module4"))
  androidTestImplementation(project(":module08:module11:module01:module6:module3"))
  androidTestImplementation(project(":module08:module11:module02:module3"))
  androidTestImplementation(project(":module08:module11:module11:module4"))
  androidTestImplementation(project(":module08:module11:module13:module3"))
  androidTestImplementation(project(":module08:module11:module15:module2:module3"))
  androidTestImplementation(project(":module08:module11:module15:module4:module2"))
  androidTestImplementation(project(":module08:module11:module18:module2:module3"))
  androidTestImplementation(project(":module08:module28:module3"))
  androidTestImplementation(project(":module08:module52:module5"))
  androidTestImplementation(project(":module10:module4"))
  androidTestImplementation(project(":module11"))
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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module01:module6"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module15:module1"))
  implementation("com.bugsnag:bugsnag-android:5.0.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
