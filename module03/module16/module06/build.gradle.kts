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
  api(project(":module01:module11:module2"))
  api(project(":module03:module16:module04"))
  api(project(":module06:module05:module15:module3"))
  api(project(":module07:module022:module6:module3"))
  api(project(":module07:module070"))
  api(project(":module07:module148:module11"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module213:module3"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module474"))
  api(project(":module08:module24"))
  api(project(":module08:module30"))
  api(project(":module08:module37"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module45"))
  api(project(":module10:module2"))
  api(project(":module15:module1"))
  api(project(":module19:module1:module05:module2"))
  api(project(":module19:module2:module06:module3"))
  api(project(":module23:module01:module25:module1"))
  api(project(":module23:module03:module01"))
  api(project(":module23:module03:module03"))
  api(project(":module23:module03:module05"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
}
