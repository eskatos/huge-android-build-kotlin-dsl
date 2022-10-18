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
  api(project(":module03:module22:module1:module2"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module148:module11"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module294:module3"))
  api(project(":module07:module302:module5"))
  api(project(":module07:module383:module3"))
  api(project(":module07:module471"))
  api(project(":module07:module474"))
  api(project(":module07:module500:module3"))
  api(project(":module08:module07"))
  api(project(":module08:module30"))
  api(project(":module08:module37"))
  api(project(":module08:module45"))
  api(project(":module08:module52:module4"))
  api(project(":module10:module2"))
  api(project(":module15:module1"))
  api(project(":module19:module1:module05:module2"))
  api(project(":module19:module2:module06:module3"))
  api(project(":module23:module01:module23"))
  api(project(":module23:module01:module25:module1"))
  api(project(":module23:module01:module32"))
  api(project(":module23:module01:module34"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module10:module1:module2"))
  api(project(":module23:module07:module13:module2"))
  api(project(":module23:module07:module22"))
  api(project(":module23:module07:module25"))
  api(project(":module23:module07:module29"))
  api(project(":module23:module07:module33"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
