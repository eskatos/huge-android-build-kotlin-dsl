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
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module08:module11:module13:module3"))
  androidTestImplementation(project(":module08:module11:module15:module2:module3"))
  androidTestImplementation(project(":module08:module11:module18:module1:module3"))
  androidTestImplementation(project(":module08:module11:module18:module2:module3"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module125:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module08:module11:module18:module1:module7"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module024:module3"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module066:module2"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module160:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module195:module02:module1:module1"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module289:module2"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module421:module4"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module08:module12:module02:module2:module1"))
  implementation(project(":module08:module12:module07:module1"))
  implementation(project(":module08:module12:module08:module1"))
  implementation(project(":module08:module12:module09:module1"))
  implementation(project(":module08:module12:module11:module1"))
  implementation(project(":module08:module11:module03:module1"))
  implementation(project(":module08:module11:module10:module2"))
  implementation(project(":module08:module11:module12:module2"))
  implementation(project(":module08:module11:module13:module2"))
  implementation(project(":module08:module11:module14:module1:module1"))
  implementation(project(":module08:module11:module15:module1:module2"))
  implementation(project(":module08:module11:module15:module2:module2"))
  implementation(project(":module08:module11:module15:module3:module2"))
  implementation(project(":module08:module11:module15:module4:module1"))
  implementation(project(":module08:module11:module17:module2"))
  implementation(project(":module08:module11:module18:module1:module2"))
  implementation(project(":module08:module11:module18:module1:module4"))
  implementation(project(":module08:module11:module18:module2:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
