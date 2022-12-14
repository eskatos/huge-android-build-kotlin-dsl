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
  api("androidx.test.espresso:espresso-core:3.3.0")
  api("junit:junit:4.13.2")
  api("org.hamcrest:hamcrest-core:1.3")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module151:module1"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module549:module3"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("androidx.test:monitor:1.5.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
}
