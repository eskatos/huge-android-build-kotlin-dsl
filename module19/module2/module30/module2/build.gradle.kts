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
  api(project(":module07:module539:module1"))
  api(project(":module19:module2:module30:module1"))
  api(project(":module19:module2:module30:module5"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module3"))
  implementation(project(":module19:module2:module30:module1"))
  implementation(project(":module19:module5:module6:module1"))
  implementation(project(":module19:module5:module8"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
