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
  api(project(":module07:module175:module1"))
  api(project(":module19:module2:module15:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module19"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module428:module4"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module19:module2:module10:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
