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
  api(project(":module07:module340"))
  api(project(":module07:module539:module1"))
  api(project(":module08:module11:module01:module6:module4"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module538:module1"))
  implementation(project(":module08:module11:module01:module6:module2"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
