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
  api(project(":module07:module538:module1"))
  api(project(":module07:module539:module1"))
  api(project(":module19:module2:module04:module7"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module19:module2:module04:module4"))
  implementation(project(":module19:module2:module04:module6"))
  implementation(project(":module19:module5:module2:module1"))
  implementation(project(":module19:module5:module5"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
