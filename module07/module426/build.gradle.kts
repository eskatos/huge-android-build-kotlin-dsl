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
  api(project(":module07:module329:module1"))
  api(project(":module07:module425:module1"))
  api("androidx.recyclerview:recyclerview:1.0.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module518:module01"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
