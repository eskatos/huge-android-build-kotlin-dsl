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
  api(project(":module07:module027:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module384:module3"))
  api(project(":module07:module383:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module012"))
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module044"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module386"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module532"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("androidx.test:runner:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
