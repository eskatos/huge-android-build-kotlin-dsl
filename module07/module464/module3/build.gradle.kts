plugins {
  id("com.android.library")
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
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module07:module175:module1"))
  api(project(":module07:module466:module1"))
  api(project(":module07:module464:module1"))
  api(project(":module07:module464:module6"))
  api(project(":module07:module518:module10"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module447:module1"))
}
