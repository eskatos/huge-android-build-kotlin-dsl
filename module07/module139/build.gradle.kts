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
  api(project(":module07:module024:module5"))
  api(project(":module07:module035:module2"))
  api(project(":module07:module077:module7"))
  api(project(":module07:module127"))
  api(project(":module07:module177:module1"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module235:module1"))
  api(project(":module07:module246"))
  api(project(":module07:module249"))
  api(project(":module07:module265:module2"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module311"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module342:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module368:module6"))
  api(project(":module07:module379:module2"))
  api(project(":module07:module403:module1:module5"))
  api(project(":module07:module403:module2:module4"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module437:module2"))
  api(project(":module07:module506:module2"))
  api(project(":module07:module527"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module557"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module07:module563:module1:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module34:module7"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module125:module4"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module505:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module05:module34:module1"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module201:module1"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
