plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module05:module34:module6"))
  api(project(":module06:module02:module2"))
  api(project(":module06:module08:module3"))
  api(project(":module07:module025:module5"))
  api(project(":module07:module070"))
  api(project(":module07:module074:module2"))
  api(project(":module07:module075"))
  api(project(":module07:module085:module1"))
  api(project(":module07:module099"))
  api(project(":module07:module114:module2"))
  api(project(":module07:module121:module4"))
  api(project(":module07:module127"))
  api(project(":module07:module169"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module206"))
  api(project(":module07:module215"))
  api(project(":module07:module213:module5"))
  api(project(":module07:module249"))
  api(project(":module07:module257:module2"))
  api(project(":module07:module283:module4"))
  api(project(":module07:module288"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module349:module3"))
  api(project(":module07:module346:module1"))
  api(project(":module07:module371:module3"))
  api(project(":module07:module383:module2"))
  api(project(":module07:module405:module3"))
  api(project(":module07:module407:module2"))
  api(project(":module07:module527"))
  api(project(":module07:module536:module5"))
  api(project(":module07:module545:module2"))
  api(project(":module07:module548:module1"))
  api(project(":module08:module53"))
  api(project(":module08:module54:module2"))
  api(project(":module08:module59"))
  api(project(":module10:module1"))
  api("androidx.work:work-runtime-ktx:2.7.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton:process-phoenix:2.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
