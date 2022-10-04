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
  api(project(":module03:module09:module3"))
  api(project(":module03:module09:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module15:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module06:module12:module5"))
  compileOnly(project(":module07:module383:module3"))
  compileOnly(project(":module07:module471"))
  compileOnly(project(":module07:module474"))
  compileOnly(project(":module08:module07"))
  compileOnly(project(":module08:module37"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module298:module7"))
}
