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
  api(project(":module07:module024:module5"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module046:module2"))
  api(project(":module07:module119:module2"))
  api(project(":module07:module114:module2"))
  api(project(":module07:module127"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module207:module1"))
  api(project(":module07:module452:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module527"))
  api(project(":module08:module02:module4"))
  api(project(":module08:module03:module2"))
  api(project(":module08:module05:module4"))
  api(project(":module08:module20:module1"))
  api(project(":module08:module20:module3"))
  api(project(":module08:module23:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
