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
  api(project(":module02:module25:module1"))
  api(project(":module02:module32"))
  api(project(":module02:module35:module2"))
  api(project(":module02:module42:module1"))
  api(project(":module02:module48:module3"))
  api(project(":module02:module50:module2"))
  api(project(":module02:module51:module3"))
  api(project(":module02:module52:module1"))
  api(project(":module03:module20:module4"))
  api(project(":module07:module022:module6:module3"))
  api(project(":module07:module118:module3"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module148:module11"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module343:module3"))
  api(project(":module07:module344:module3"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module469:module2"))
  api(project(":module07:module474"))
  api(project(":module07:module500:module3"))
  api(project(":module08:module10:module5"))
  api(project(":module08:module30"))
  api(project(":module08:module34:module2"))
  api(project(":module08:module33:module4"))
  api(project(":module08:module37"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module45"))
  api(project(":module08:module52:module4"))
  api(project(":module10:module2"))
  api(project(":module15:module1"))
  api(project(":module23:module01:module23"))
  api(project(":module23:module01:module25:module1"))
  api(project(":module23:module01:module34"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module08:module1:module2"))
  api(project(":module23:module07:module13:module2"))
  api(project(":module23:module07:module22"))
  api(project(":module23:module07:module25"))
  api(project(":module23:module07:module29"))
  api(project(":module23:module07:module33"))
  compileOnly(project(":module07:module033:module2"))
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
