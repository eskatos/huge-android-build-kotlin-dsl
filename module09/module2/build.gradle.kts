plugins {
  id("com.android.library")
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
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module041:module5"))
  api(project(":module07:module074:module3"))
  api(project(":module07:module075"))
  api(project(":module07:module182"))
  api(project(":module07:module249"))
  api(project(":module07:module298:module1"))
  api(project(":module07:module301:module4"))
  api(project(":module07:module443:module5"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module467:module1"))
  api(project(":module07:module497:module2"))
  api(project(":module07:module538:module1"))
  api(project(":module07:module539:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module032:module5"))
  implementation(project(":module07:module224:module4"))
  implementation(project(":module08:module13:module1"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("androidx.test.uiautomator:uiautomator:2.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
