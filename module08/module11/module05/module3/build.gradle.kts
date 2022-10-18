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
    androidResources = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module150:module2"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module329:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module08:module12:module05:module1"))
  api(project(":module08:module11:module04:module1"))
  api("androidx.cardview:cardview:1.0.0")
  api("androidx.constraintlayout:constraintlayout:1.1.3")
  api("androidx.databinding:viewbinding:7.3.1")
  api("androidx.recyclerview:recyclerview:1.0.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module542:module2"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
