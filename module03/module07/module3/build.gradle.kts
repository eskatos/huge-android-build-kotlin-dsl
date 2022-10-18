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
  api(project(":module03:module07:module2"))
  api(project(":module05:module06:module4"))
  api(project(":module07:module002:module2"))
  api(project(":module07:module009:module2"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module025:module5"))
  api(project(":module07:module045:module3"))
  api(project(":module07:module121:module3"))
  api(project(":module07:module149:module1"))
  api(project(":module07:module153:module2"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module163:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module2"))
  api(project(":module07:module185:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module188:module1"))
  api(project(":module07:module200:module3"))
  api(project(":module07:module229:module9:module1"))
  api(project(":module07:module236:module2"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module389:module3"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module443:module1"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module481:module4"))
  api(project(":module07:module488:module3"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module562:module1"))
  api(project(":module19:module3:module4:module1"))
  api(project(":module19:module3:module5:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
