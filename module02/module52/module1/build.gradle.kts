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
  api("androidx.databinding:viewbinding:7.3.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module07:module563:module2:module1"))
  implementation("androidx.recyclerview:recyclerview:1.0.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
