plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module07:module013:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module184:module2"))
  api(project(":module07:module183:module09"))
  api(project(":module07:module183:module10"))
  api(project(":module07:module186:module3"))
  api(project(":module07:module518:module02"))
  api(project(":module07:module539:module1"))
  api("androidx.test:runner:1.4.0")
  api("com.google.dagger:dagger:2.39.1")
  api("junit:junit:4.13.2")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module183:module04"))
  implementation(project(":module07:module447:module2"))
  implementation(project(":module07:module464:module2"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module540:module1"))
  implementation("androidx.test.uiautomator:uiautomator:2.2.0")
  implementation("androidx.test:rules:1.4.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
