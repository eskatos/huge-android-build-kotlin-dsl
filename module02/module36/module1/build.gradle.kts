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
    compose = true
  }
}
dependencies {
  androidTestImplementation(project(":module02:module36:module5"))
  androidTestImplementation(project(":module02:module43:module2"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module536:module3"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module541:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module02:module36:module8"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module2"))
  implementation(project(":module02:module36:module4"))
  implementation(project(":module02:module36:module7"))
  implementation(project(":module02:module41:module19:module3"))
  implementation(project(":module02:module41:module29:module1"))
  implementation(project(":module02:module47:module1"))
  implementation(project(":module07:module011:module2"))
  implementation(project(":module07:module031:module2"))
  implementation(project(":module07:module032:module4"))
  implementation(project(":module07:module036:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module121:module3"))
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module204:module1"))
  implementation(project(":module07:module258:module1"))
  implementation(project(":module07:module321:module4"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module332:module1"))
  implementation(project(":module07:module332:module2"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module506:module1"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module1"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module08:module52:module4"))
  implementation(project(":module08:module52:module7"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
