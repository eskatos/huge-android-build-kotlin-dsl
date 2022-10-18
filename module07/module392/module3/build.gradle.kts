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
  api(project(":module07:module016:module5"))
  api(project(":module07:module121:module5"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module001:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
