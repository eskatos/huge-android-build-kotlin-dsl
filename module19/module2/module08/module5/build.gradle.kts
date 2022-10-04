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
  api(project(":module19:module2:module07:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module107:module2"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module19:module1:module03:module2"))
  implementation(project(":module19:module1:module21:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
