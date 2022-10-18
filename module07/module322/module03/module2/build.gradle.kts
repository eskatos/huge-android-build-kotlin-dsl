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
    androidResources = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module074:module3"))
  api(project(":module07:module322:module01:module1"))
  api(project(":module07:module320:module7"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module394:module1"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module563:module1:module1"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("androidx.gridlayout:gridlayout:1.0.0")
  api("com.google.android.material:material:1.2.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module522:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
}
