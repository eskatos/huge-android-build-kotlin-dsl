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
  api(project(":module07:module002:module1"))
  api(project(":module07:module009:module2"))
  api(project(":module07:module005:module3"))
  api(project(":module07:module005:module4"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module029:module1"))
  api(project(":module07:module045:module3"))
  api(project(":module07:module046:module1"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module2"))
  api(project(":module07:module184:module3"))
  api(project(":module07:module183:module04"))
  api(project(":module07:module183:module10"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module186:module4"))
  api(project(":module07:module200:module2"))
  api(project(":module07:module236:module2"))
  api(project(":module07:module237:module3"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module257:module2"))
  api(project(":module07:module393:module1"))
  api(project(":module07:module464:module3"))
  api(project(":module07:module464:module5"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module518:module03"))
  api(project(":module07:module518:module05"))
  api(project(":module07:module518:module07"))
  api(project(":module07:module518:module09"))
  api(project(":module07:module525:module1"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module549:module2"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module445:module1"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
