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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module041:module6"))
  api(project(":module07:module037:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module040:module5"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation("com.google.zxing:core:3.4.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module298:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
