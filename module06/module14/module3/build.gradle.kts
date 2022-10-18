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
  api(project(":module06:module05:module05:module5"))
  api(project(":module06:module14:module1"))
  api(project(":module06:module14:module4"))
  api(project(":module07:module143:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module188:module3"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module298:module7"))
  api(project(":module07:module395:module1"))
  api(project(":module07:module420:module1"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module547:module3"))
  api(project(":module18:module10:module2:module1"))
  api(project(":module18:module10:module5:module1"))
  api(project(":module18:module10:module6:module1"))
  api(project(":module18:module11:module4:module1"))
  api(project(":module18:module11:module4:module2"))
  api(project(":module18:module12:module1"))
  api("androidx.lifecycle:lifecycle-common-java8:2.4.0")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module147:module8"))
  implementation(project(":module18:module12:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
