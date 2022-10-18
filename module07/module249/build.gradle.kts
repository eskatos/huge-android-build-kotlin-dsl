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
  api(project(":module05:module01:module3"))
  api(project(":module05:module31:module6"))
  api(project(":module07:module013:module4"))
  api(project(":module07:module046:module2"))
  api(project(":module07:module106:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module445:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module546:module1"))
  api(project(":module14:module3:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module3"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module30:module9"))
  implementation(project(":module05:module31:module6"))
  implementation(project(":module05:module34:module7"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module394:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module520:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("com.google.code.gson:gson:2.8.6")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.google.zxing:core:3.4.1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("com.starmicronics:stario:5.14.0")
  implementation("com.starmicronics:starioextension:5.14.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module05:module01:module3"))
  testImplementation(project(":module05:module34:module1"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
