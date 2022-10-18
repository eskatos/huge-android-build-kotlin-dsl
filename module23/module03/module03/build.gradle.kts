plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module07:module078:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module237:module7"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module522:module4"))
  api(project(":module23:module01:module03"))
  api(project(":module23:module01:module11"))
  api(project(":module23:module01:module23"))
  api(project(":module23:module01:module29"))
  api(project(":module23:module01:module31:module1"))
  api(project(":module23:module01:module33:module5"))
  api(project(":module23:module01:module37"))
  api(project(":module23:module01:module38"))
  api(project(":module23:module01:module36:module7"))
  api(project(":module23:module01:module40:module1"))
  api(project(":module23:module01:module45"))
  api(project(":module23:module01:module46"))
  api(project(":module23:module03:module06"))
  api(project(":module23:module03:module07"))
  api(project(":module23:module03:module09"))
  api(project(":module24:module3:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.timber:timber:4.6.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module22"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module236:module3"))
  implementation(project(":module07:module283:module5"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module481:module5"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module23:module01:module07:module2"))
  implementation(project(":module23:module01:module09:module2"))
  implementation(project(":module23:module01:module10:module2"))
  implementation(project(":module23:module01:module21:module3"))
  implementation(project(":module23:module01:module20:module1"))
  implementation(project(":module23:module01:module42"))
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
