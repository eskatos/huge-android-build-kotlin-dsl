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
  api(project(":module03:module08:module1:module2"))
  api(project(":module07:module040:module2"))
  api(project(":module07:module041:module5"))
  api(project(":module07:module037:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module186:module3"))
  api(project(":module07:module488:module1"))
  api(project(":module07:module509:module1"))
  api(project(":module07:module518:module02"))
  api(project(":module07:module539:module1"))
  api(project(":module23:module01:module51:module1"))
  api(project(":module23:module02:module2:module3"))
  api(project(":module23:module02:module3:module2"))
  api(project(":module23:module02:module4:module2"))
  api(project(":module23:module02:module6:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module540:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
