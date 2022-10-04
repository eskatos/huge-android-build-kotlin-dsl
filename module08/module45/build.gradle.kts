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
  api(project(":module01:module11:module3"))
  api(project(":module07:module016:module5"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module032:module7"))
  api(project(":module07:module112"))
  api(project(":module07:module113:module2"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module199:module3"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module226:module5"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module342:module1"))
  api(project(":module07:module435:module1"))
  api(project(":module07:module525:module1"))
  api(project(":module07:module546:module1"))
  api(project(":module08:module07"))
  api(project(":module08:module31:module4"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module46:module3"))
  api(project(":module08:module46:module6"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module109:module3"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module430:module2"))
  implementation(project(":module07:module429:module6"))
  implementation(project(":module07:module439:module4"))
  implementation(project(":module07:module474"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module514:module5"))
  implementation(project(":module07:module549:module3"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module025:module3"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
