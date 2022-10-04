plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module06:module05:module02:module3"))
  api(project(":module07:module385:module1"))
  api(project(":module07:module539:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module05:module02:module1"))
  implementation(project(":module06:module05:module16:module2"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module556"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
