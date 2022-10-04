plugins {
  id("com.android.library")
  kotlin("android")
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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module539:module1"))
  api(project(":module23:module01:module21:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module3"))
  implementation(project(":module07:module556"))
  implementation(project(":module23:module01:module21:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
