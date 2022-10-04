plugins {
  id("com.android.library")
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
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module03:module18:module03"))
  api(project(":module03:module18:module06"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module383:module3"))
  api(project(":module07:module471"))
  api(project(":module07:module522:module1"))
  api(project(":module07:module522:module3"))
  api(project(":module08:module07"))
  api(project(":module08:module37"))
  api(project(":module15:module2"))
  api(project(":module23:module03:module02"))
  api(project(":module23:module03:module07"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
