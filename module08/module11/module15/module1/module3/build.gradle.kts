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
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module12:module11:module3"))
  api(project(":module08:module11:module03:module1"))
  api(project(":module08:module11:module15:module2:module4"))
  api(project(":module08:module11:module15:module3:module4"))
  api(project(":module08:module11:module15:module4:module3"))
  api(project(":module08:module11:module18:module1:module7"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module066:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
