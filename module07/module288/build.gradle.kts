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
  api(project(":module01:module08"))
  api(project(":module07:module024:module5"))
  api(project(":module07:module118:module3"))
  api(project(":module07:module125:module4"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module177:module1"))
  api(project(":module07:module241:module2"))
  api(project(":module07:module243:module8"))
  api(project(":module07:module311"))
  api(project(":module07:module403:module1:module5"))
  api(project(":module07:module428:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module527"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module557"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module278:module3"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
