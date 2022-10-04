plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module05:module14:module14"))
  api(project(":module07:module082:module2"))
  api(project(":module07:module095:module6"))
  api(project(":module07:module102"))
  api(project(":module07:module458:module3"))
  api(project(":module07:module527"))
  api(project(":module07:module538:module1"))
  api(project(":module07:module539:module1"))
  api(project(":module23:module07:module07:module2"))
  api("androidx.test.espresso:espresso-contrib:3.3.0")
  api("androidx.test.espresso:espresso-core:3.3.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
