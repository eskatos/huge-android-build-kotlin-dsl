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
  api(project(":module03:module16:module04"))
  api(project(":module05:module14:module10"))
  api(project(":module06:module16:module09"))
  api(project(":module07:module041:module5"))
  api(project(":module07:module148:module08"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module186:module3"))
  api(project(":module07:module297:module1"))
  api(project(":module07:module384:module2"))
  api(project(":module07:module440:module3"))
  api(project(":module07:module509:module1"))
  api(project(":module07:module518:module02"))
  api(project(":module07:module539:module1"))
  api(project(":module07:module545:module1"))
  api(project(":module19:module2:module37:module2"))
  api(project(":module23:module01:module08:module1"))
  api(project(":module23:module01:module08:module2"))
  api(project(":module23:module01:module36:module5"))
  api(project(":module23:module01:module51:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module540:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
