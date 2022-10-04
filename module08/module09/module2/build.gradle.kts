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
  api(project(":module07:module066:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module258:module1"))
  api(project(":module07:module403:module4:module1"))
  api(project(":module07:module526:module1:module2"))
  api(project(":module08:module09:module1"))
  api(project(":module08:module09:module3"))
  api(project(":module08:module12:module01:module2"))
  api(project(":module08:module12:module02:module1:module2"))
  api(project(":module08:module12:module02:module2:module2"))
  api(project(":module08:module12:module03:module1"))
  api(project(":module08:module12:module04:module1"))
  api(project(":module08:module12:module07:module2"))
  api(project(":module08:module12:module09:module2"))
  api(project(":module08:module12:module10:module1"))
  api(project(":module08:module12:module11:module2"))
  api(project(":module08:module12:module12:module1"))
  api(project(":module08:module12:module13:module2"))
  api(project(":module08:module11:module01:module1:module3"))
  api(project(":module08:module11:module01:module2:module2"))
  api(project(":module08:module11:module01:module3:module1"))
  api(project(":module08:module11:module01:module4:module1"))
  api(project(":module08:module11:module01:module5:module2"))
  api(project(":module08:module11:module01:module6:module2"))
  api(project(":module08:module11:module01:module7:module3"))
  api(project(":module08:module11:module02:module2"))
  api(project(":module08:module11:module06:module2"))
  api(project(":module08:module11:module07:module1"))
  api(project(":module08:module11:module09:module1"))
  api(project(":module08:module11:module10:module2"))
  api(project(":module08:module11:module11:module6"))
  api(project(":module08:module11:module12:module3"))
  api(project(":module08:module11:module13:module2"))
  api(project(":module08:module11:module14:module1:module2"))
  api(project(":module08:module11:module14:module2:module2"))
  api(project(":module08:module11:module14:module3:module2"))
  api(project(":module08:module11:module16:module2"))
  api(project(":module08:module11:module15:module1:module2"))
  api(project(":module08:module11:module15:module2:module2"))
  api(project(":module08:module11:module15:module3:module2"))
  api(project(":module08:module11:module15:module4:module1"))
  api(project(":module08:module11:module17:module2"))
  api(project(":module08:module11:module18:module1:module4"))
  api(project(":module08:module11:module18:module2:module2"))
  api(project(":module08:module11:module19:module2"))
  api(project(":module08:module11:module20:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
