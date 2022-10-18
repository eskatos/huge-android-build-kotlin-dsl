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
  api(project(":module06:module05:module08:module2"))
  api(project(":module06:module05:module11:module2"))
  api(project(":module06:module07:module4"))
  api(project(":module07:module127"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module240:module3"))
  api(project(":module07:module487"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module081:module1"))
  api(project(":module18:module04:module2:module2"))
  api(project(":module18:module10:module3:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
