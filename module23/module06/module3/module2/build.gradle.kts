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
  api(project(":module01:module03"))
  api(project(":module01:module11:module2"))
  api(project(":module03:module19:module1:module2"))
  api(project(":module07:module022:module6:module3"))
  api(project(":module07:module083:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module368:module4"))
  api(project(":module07:module471"))
  api(project(":module07:module474"))
  api(project(":module07:module522:module3"))
  api(project(":module08:module07"))
  api(project(":module08:module52:module4"))
  api(project(":module15:module1"))
  api(project(":module23:module01:module25:module1"))
  api(project(":module23:module01:module34"))
  api(project(":module23:module01:module50"))
  api(project(":module23:module03:module01"))
  api(project(":module23:module03:module03"))
  api(project(":module23:module03:module07"))
  api(project(":module24:module2:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
}
