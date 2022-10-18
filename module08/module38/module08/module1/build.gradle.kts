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
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module338:module1"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module08:module38:module08:module3"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module08:module38:module08:module5"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module2"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module132:module4"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module195:module10:module2:module2"))
  implementation(project(":module07:module213:module3"))
  implementation(project(":module07:module258:module2"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module368:module1"))
  implementation(project(":module07:module368:module3"))
  implementation(project(":module07:module403:module1:module1"))
  implementation(project(":module07:module403:module1:module5"))
  implementation(project(":module07:module406:module3"))
  implementation(project(":module07:module424:module1"))
  implementation(project(":module07:module460:module2"))
  implementation(project(":module07:module489:module3"))
  implementation(project(":module07:module498:module2"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module08:module37"))
  implementation(project(":module08:module38:module08:module4"))
  implementation(project(":module08:module38:module09:module3"))
  implementation(project(":module08:module38:module13:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
