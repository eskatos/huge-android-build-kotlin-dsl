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
  api(project(":module03:module08:module2:module1"))
  api(project(":module07:module002:module2"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module025:module5"))
  api(project(":module07:module038:module4"))
  api(project(":module07:module040:module4"))
  api(project(":module07:module041:module2"))
  api(project(":module07:module041:module4"))
  api(project(":module07:module037:module5"))
  api(project(":module07:module045:module3"))
  api(project(":module07:module077:module4"))
  api(project(":module07:module121:module4"))
  api(project(":module07:module147:module7"))
  api(project(":module07:module149:module1"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module163:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module176:module2"))
  api(project(":module07:module176:module4"))
  api(project(":module07:module185:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module188:module2"))
  api(project(":module07:module200:module2"))
  api(project(":module07:module229:module9:module2"))
  api(project(":module07:module236:module2"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module336:module1"))
  api(project(":module07:module389:module3"))
  api(project(":module07:module393:module1"))
  api(project(":module07:module398:module2"))
  api(project(":module07:module417:module2"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module481:module3"))
  api(project(":module07:module481:module4"))
  api(project(":module07:module488:module2"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module537:module2"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module562:module1"))
  api(project(":module23:module01:module01:module1"))
  api(project(":module23:module01:module04:module1"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module13:module2"))
  api(project(":module23:module01:module13:module3"))
  api(project(":module23:module01:module27:module5"))
  api(project(":module23:module01:module36:module6"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module01:module51:module2"))
  api(project(":module23:module02:module2:module1"))
  api(project(":module23:module02:module2:module2"))
  api(project(":module23:module02:module3:module1"))
  api(project(":module23:module02:module4:module4"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
