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
  api(project(":module04:module01:module3"))
  api(project(":module04:module03:module2"))
  api(project(":module07:module002:module3"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module533:module4"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module563:module1:module1"))
  api("androidx.fragment:fragment:1.3.6")
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module186:module5"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module563:module2:module1"))
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
