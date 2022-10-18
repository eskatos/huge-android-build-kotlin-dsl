plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module07:module024:module2"))
  api(project(":module07:module024:module3"))
  api(project(":module07:module024:module5"))
  api(project(":module07:module166:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module05:module2:module1"))
  api(project(":module07:module196:module2"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module368:module3"))
  api(project(":module07:module438:module1"))
  api(project(":module07:module452:module2"))
  api(project(":module08:module62:module4"))
  api(project(":module20:module1:module1:module3"))
  api(project(":module20:module2:module08:module5"))
  api(project(":module20:module2:module18:module4"))
  api(project(":module20:module3:module5"))
  api(project(":module20:module3:module6"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
