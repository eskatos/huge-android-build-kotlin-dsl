plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module07:module166:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module321:module5"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module56:module2"))
  api(project(":module10:module1"))
  api(project(":module10:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module050:module6"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module227:module2:module2"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module08:module53"))
  implementation(project(":module13:module01"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
