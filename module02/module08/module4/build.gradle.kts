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
  api(project(":module02:module08:module6"))
  api(project(":module02:module09:module3"))
  api(project(":module02:module22:module2"))
  api(project(":module07:module339:module3"))
  api(project(":module07:module539:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module08:module3"))
  implementation(project(":module02:module52:module1"))
  implementation(project(":module07:module030:module2:module2"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module536:module3"))
  implementation(project(":module07:module556"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
