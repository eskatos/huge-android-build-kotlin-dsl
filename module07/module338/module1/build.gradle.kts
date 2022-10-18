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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module151:module1"))
  api(project(":module07:module177:module1"))
  api(project(":module07:module313:module5"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module550:module1"))
  api(project(":module07:module554:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("androidx.constraintlayout:constraintlayout:1.1.3")
  api("androidx.transition:transition:1.2.0")
  api("androidx.viewpager2:viewpager2:1.0.0")
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module542:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
