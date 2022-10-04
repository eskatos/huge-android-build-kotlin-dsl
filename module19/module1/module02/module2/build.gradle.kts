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
  api(project(":module07:module175:module1"))
  api(project(":module08:module44:module5"))
  api(project(":module19:module1:module02:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module253:module4"))
  implementation(project(":module07:module469:module2"))
  implementation(project(":module07:module512:module7"))
  implementation(project(":module08:module42:module6"))
  implementation(project(":module19:module2:module10:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
