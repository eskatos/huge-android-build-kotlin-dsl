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
  api(project(":module06:module04:module2"))
  api(project(":module06:module05:module13:module3"))
  api(project(":module06:module07:module4"))
  api(project(":module07:module127"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module194"))
  api(project(":module07:module246"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module07:module563:module2:module1"))
  api(project(":module16:module074:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module464:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
