plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module23:module01:module26:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module07:module563:module2:module1"))
  implementation(project(":module23:module01:module51:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
