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
  api(project(":module07:module175:module1"))
  api(project(":module07:module539:module1"))
  api(project(":module23:module01:module02:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module27:module4"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module540:module1"))
  implementation(project(":module09:module3"))
  implementation(project(":module23:module01:module02:module1"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
