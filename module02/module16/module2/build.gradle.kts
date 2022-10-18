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
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module02:module08:module6"))
  api(project(":module02:module10:module2"))
  api(project(":module02:module13:module4"))
  api(project(":module02:module14:module4"))
  api(project(":module02:module15:module4"))
  api(project(":module02:module16:module4"))
  api(project(":module02:module34:module4"))
  api(project(":module02:module37:module4"))
  api(project(":module02:module41:module07:module3"))
  api(project(":module02:module41:module16:module3"))
  api(project(":module02:module41:module20:module1"))
  api(project(":module02:module41:module38:module3"))
  api(project(":module02:module47:module4"))
  api(project(":module02:module48:module4"))
  api(project(":module02:module52:module1"))
  api(project(":module07:module033:module2"))
  api(project(":module07:module134:module5"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module311"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module399"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module519:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module52:module7"))
  api("com.google.android.material:material:1.2.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module3"))
  implementation(project(":module02:module19:module6"))
  implementation(project(":module02:module20:module4"))
  implementation(project(":module02:module36:module8"))
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module262:module3"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module565:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module02:module41:module08:module4"))
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation(project(":module02:module41:module38:module4"))
  testImplementation(project(":module02:module41:module41:module4"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
