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
  api(project(":module01:module19"))
  api(project(":module06:module12:module5"))
  api(project(":module07:module033:module2"))
  api(project(":module07:module047:module3"))
  api(project(":module07:module070"))
  api(project(":module07:module091:module4"))
  api(project(":module07:module095:module6"))
  api(project(":module07:module167:module3"))
  api(project(":module07:module193"))
  api(project(":module07:module195:module01:module3"))
  api(project(":module07:module195:module02:module4:module10"))
  api(project(":module07:module195:module02:module8:module6"))
  api(project(":module07:module195:module05:module1:module4"))
  api(project(":module07:module195:module05:module3:module3"))
  api(project(":module07:module195:module05:module3:module4"))
  api(project(":module07:module195:module05:module4:module4"))
  api(project(":module07:module195:module10:module2:module4"))
  api(project(":module07:module269"))
  api(project(":module07:module270:module4"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module272:module1"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module322:module04:module5"))
  api(project(":module07:module346:module3"))
  api(project(":module07:module425:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module423:module1"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module561:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module068"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module195:module07:module4"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module302:module7"))
  testImplementation(project(":module07:module322:module04:module6"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module526:module2:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
