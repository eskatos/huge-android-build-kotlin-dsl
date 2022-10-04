plugins {
  id("com.android.library")
  kotlin("android")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module022:module3:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module10:module1:module6"))
  api(project(":module07:module268:module2"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module476:module4"))
  api(project(":module07:module491:module4"))
  api(project(":module07:module513:module4"))
  api(project(":module07:module544:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module44:module3"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module308:module3"))
  implementation(project(":module07:module479:module2"))
  implementation(project(":module10:module2"))
  implementation(project(":module23:module01:module23"))
  implementation(project(":module23:module03:module07"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
