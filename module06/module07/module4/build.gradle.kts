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
  api(project(":module06:module18:module1"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module106:module1"))
  api(project(":module18:module10:module3:module1"))
  api(project(":module18:module11:module4:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("javax.inject:javax.inject:1")
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
