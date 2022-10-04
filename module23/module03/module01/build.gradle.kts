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
  api(project(":module07:module084:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module302:module5"))
  api(project(":module07:module458:module2"))
  api(project(":module07:module500:module3"))
  api(project(":module08:module52:module4"))
  api(project(":module08:module58"))
  api(project(":module15:module1"))
  api(project(":module23:module01:module06:module2"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module15:module2"))
  api(project(":module23:module01:module28:module2"))
  api(project(":module23:module01:module32"))
  api(project(":module23:module01:module34"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module03:module03"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
