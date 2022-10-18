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
  api(project(":module02:module48:module2"))
  api(project(":module02:module48:module4"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module10:module2"))
  implementation(project(":module02:module41:module08:module3"))
  implementation(project(":module02:module41:module09:module2"))
  implementation(project(":module02:module41:module16:module3"))
  implementation(project(":module02:module41:module22:module1"))
  implementation(project(":module02:module41:module37:module1"))
  implementation(project(":module02:module41:module38:module3"))
  implementation(project(":module02:module41:module39:module1"))
  implementation(project(":module02:module41:module42:module1"))
  implementation(project(":module02:module42:module1"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module331:module1"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module546:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
