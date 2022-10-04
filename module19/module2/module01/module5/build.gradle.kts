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
  api(project(":module07:module563:module1:module1"))
  api(project(":module19:module2:module25:module1"))
  api(project(":module19:module2:module24:module6"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module550:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
