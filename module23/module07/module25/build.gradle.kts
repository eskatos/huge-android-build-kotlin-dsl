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
  api(project(":module07:module083:module3"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module500:module3"))
  api(project(":module08:module24"))
  api(project(":module08:module26"))
  api(project(":module08:module58"))
  api(project(":module15:module1"))
  api(project(":module23:module01:module02:module1"))
  api(project(":module23:module01:module06:module2"))
  api(project(":module23:module01:module15:module2"))
  api(project(":module23:module01:module28:module2"))
  api(project(":module23:module01:module32"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module07:module13:module2"))
  api(project(":module23:module07:module34"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
