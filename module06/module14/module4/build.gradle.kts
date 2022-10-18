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
  api(project(":module06:module05:module08:module2"))
  api(project(":module06:module05:module16:module3"))
  api(project(":module16:module031:module1"))
  api(project(":module18:module01:module3"))
  api(project(":module18:module10:module2:module2"))
  api(project(":module18:module10:module6:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module098:module1"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
