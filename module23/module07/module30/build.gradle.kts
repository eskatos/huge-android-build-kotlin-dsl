plugins {
  id("com.android.library")
  kotlin("android")
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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module017:module2"))
  api(project(":module07:module166:module2"))
  api(project(":module07:module178"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module500:module4"))
  api(project(":module07:module512:module7"))
  api(project(":module08:module09:module3"))
  api(project(":module08:module39:module2"))
  api(project(":module23:module01:module33:module5"))
  api(project(":module23:module07:module13:module3"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module01:module17"))
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module016:module5"))
  implementation(project(":module07:module050:module6"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module253:module4"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module282:module5"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module343:module3"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module569"))
  implementation(project(":module08:module28:module5"))
  implementation(project(":module08:module34:module2"))
  implementation(project(":module08:module44:module5"))
  implementation(project(":module23:module01:module31:module1"))
  implementation(project(":module23:module01:module42"))
  implementation(project(":module23:module01:module45"))
  implementation(project(":module23:module01:module46"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
}
