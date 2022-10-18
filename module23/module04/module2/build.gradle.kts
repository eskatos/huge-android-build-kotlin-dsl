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
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module01:module03"))
  api(project(":module01:module12:module3"))
  api(project(":module02:module11:module3"))
  api(project(":module02:module25:module1"))
  api(project(":module02:module34:module3"))
  api(project(":module02:module35:module2"))
  api(project(":module02:module42:module1"))
  api(project(":module02:module48:module3"))
  api(project(":module02:module51:module3"))
  api(project(":module02:module52:module1"))
  api(project(":module03:module15:module1:module2"))
  api(project(":module07:module118:module3"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module148:module11"))
  api(project(":module07:module166:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module331:module1"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module469:module2"))
  api(project(":module07:module474"))
  api(project(":module08:module10:module5"))
  api(project(":module08:module24"))
  api(project(":module08:module26"))
  api(project(":module08:module30"))
  api(project(":module08:module35:module2"))
  api(project(":module08:module37"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module45"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module52:module4"))
  api(project(":module10:module2"))
  api(project(":module15:module1"))
  api(project(":module23:module01:module23"))
  api(project(":module23:module01:module25:module1"))
  api(project(":module23:module01:module34"))
  api(project(":module23:module01:module50"))
  api(project(":module23:module03:module01"))
  api(project(":module23:module03:module03"))
  api(project(":module23:module03:module07"))
  api(project(":module23:module03:module12"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
