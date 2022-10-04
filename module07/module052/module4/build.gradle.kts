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
  api(project(":module07:module052:module6"))
  api(project(":module07:module539:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module052:module2"))
  implementation(project(":module07:module056:module1"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module556"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
