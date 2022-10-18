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
  api(project(":module01:module04:module1"))
  api(project(":module07:module126:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module399"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module195:module05:module3:module4"))
  implementation(project(":module08:module09:module3"))
  implementation(project(":module08:module28:module5"))
  implementation(project(":module16:module068:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
