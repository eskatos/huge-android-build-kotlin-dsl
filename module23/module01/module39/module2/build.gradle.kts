plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module549:module3"))
  api(project(":module23:module01:module08:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.timber:timber:4.6.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module257:module1"))
  implementation(project(":module07:module521:module1"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module16:module054:module1"))
  implementation("com.bugsnag:bugsnag-android:5.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
