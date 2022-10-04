plugins {
  id("com.android.library")
  kotlin("android")
  id("org.jetbrains.kotlin.kapt")
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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module098:module1"))
  api(project(":module07:module151:module1"))
  api(project(":module07:module246"))
  api(project(":module07:module313:module5"))
  api(project(":module07:module328:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module554:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("se.emilsjolander.stickylistheaders:library:2.7.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module104"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module16:module031:module1"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
