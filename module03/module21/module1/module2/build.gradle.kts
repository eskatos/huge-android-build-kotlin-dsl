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
  api(project(":module05:module11:module4"))
  api(project(":module05:module14:module06"))
  api(project(":module05:module39:module2"))
  api(project(":module07:module002:module2"))
  api(project(":module07:module003:module2"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module025:module3"))
  api(project(":module07:module029:module1"))
  api(project(":module07:module076:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module3"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module188:module2"))
  api(project(":module07:module216:module3"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module393:module1"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module516:module1"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module547:module2"))
  api(project(":module23:module01:module07:module1"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module36:module6"))
  api(project(":module23:module07:module03:module1"))
  api(project(":module23:module07:module19"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
