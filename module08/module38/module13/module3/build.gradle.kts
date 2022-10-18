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
  api(project(":module07:module025:module3"))
  api(project(":module07:module118:module1"))
  api(project(":module07:module147:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module184:module1"))
  api(project(":module07:module183:module09"))
  api(project(":module07:module342:module1"))
  api(project(":module08:module37"))
  api(project(":module08:module38:module14:module1"))
  api(project(":module08:module38:module13:module9"))
  api(project(":module08:module38:module15:module2"))
  api(project(":module08:module38:module16:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module127"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module368:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
