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
  api(project(":module01:module02"))
  api(project(":module07:module001:module2"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module050:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module178"))
  api(project(":module07:module225:module3"))
  api(project(":module07:module252:module1"))
  api(project(":module07:module253:module1"))
  api(project(":module07:module253:module3"))
  api(project(":module07:module254:module3"))
  api(project(":module07:module395:module2"))
  api(project(":module07:module400:module5"))
  api(project(":module07:module415:module4"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module08:module29:module1"))
  api(project(":module08:module56:module2"))
  api(project(":module16:module028:module1"))
  api("androidx.recyclerview:recyclerview:1.0.0")
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module135:module6"))
  implementation(project(":module07:module226:module5"))
  implementation(project(":module07:module254:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module344:module4"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module503:module5"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
