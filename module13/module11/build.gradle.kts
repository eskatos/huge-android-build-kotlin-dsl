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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module011:module5"))
  api(project(":module07:module166:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module398:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module08:module28:module5"))
  api(project(":module13:module10"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module118:module3"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module270:module4"))
  implementation(project(":module07:module277:module3"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module536:module5"))
  implementation(project(":module13:module01"))
  implementation(project(":module13:module05:module6"))
  implementation(project(":module13:module06"))
  implementation(project(":module13:module08:module4"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
