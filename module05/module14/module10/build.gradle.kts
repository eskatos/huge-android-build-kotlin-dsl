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
  api(project(":module05:module01:module3"))
  api(project(":module05:module06:module1"))
  api(project(":module05:module12:module1"))
  api(project(":module05:module13:module2"))
  api(project(":module05:module14:module14"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module251"))
  api(project(":module07:module538:module1"))
  api(project(":module07:module539:module1"))
  api(project(":module07:module549:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module17:module1"))
  implementation(project(":module05:module14:module04"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module540:module1"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
