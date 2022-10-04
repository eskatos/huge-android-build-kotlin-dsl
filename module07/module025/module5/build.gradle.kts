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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module026:module1"))
  api(project(":module07:module026:module2"))
  api(project(":module07:module025:module2"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module149:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module259:module1"))
  api(project(":module07:module518:module10"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module045:module4"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module422:module2"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("com.facebook.device.yearclass:yearclass:2.0.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
