plugins {
  id("com.android.library")
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
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module19:module2:module37:module4"))
  api(project(":module19:module5:module2:module2"))
  api("androidx.constraintlayout:constraintlayout:1.1.3")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module292:module3"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module19:module1:module07:module2"))
  implementation(project(":module19:module1:module12:module2"))
  implementation(project(":module19:module2:module13:module1"))
  implementation(project(":module19:module2:module35:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}