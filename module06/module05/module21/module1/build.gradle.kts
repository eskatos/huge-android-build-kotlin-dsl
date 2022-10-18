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
  api(project(":module06:module05:module21:module5"))
  api(project(":module06:module06:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module221:module1:module7"))
  api(project(":module07:module390:module4"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module01:module3"))
  implementation(project(":module06:module19:module3:module2"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module088:module4"))
  implementation(project(":module07:module090:module7"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module385:module2"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
