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
  api("androidx.test.espresso:espresso-core:3.3.0")
  api("org.hamcrest:hamcrest-core:1.3")
  api("se.emilsjolander.stickylistheaders:library:2.7.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("androidx.recyclerview:recyclerview:1.0.0")
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("androidx.test.uiautomator:uiautomator:2.2.0")
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
