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
  api(project(":module07:module175:module1"))
  api(project(":module08:module38:module05:module8"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module249"))
  implementation(project(":module07:module292:module3"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module08:module38:module02:module2"))
  implementation(project(":module08:module38:module03:module1"))
  implementation(project(":module08:module38:module06:module6"))
  implementation(project(":module08:module38:module07:module6"))
  implementation(project(":module08:module38:module16:module3"))
  implementation(project(":module08:module38:module17:module1"))
  implementation(project(":module08:module38:module18:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
