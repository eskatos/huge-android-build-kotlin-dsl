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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module311"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module569"))
  api("androidx.recyclerview:recyclerview:1.0.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module16:module031:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module561:module1"))
}
