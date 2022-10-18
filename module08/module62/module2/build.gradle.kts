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
  api(project(":module07:module152:module1"))
  api(project(":module07:module339:module4"))
  api(project(":module07:module390:module4"))
  api(project(":module07:module519:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module62:module5"))
  api(project(":module16:module061:module1"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module023:module3:module2"))
  implementation(project(":module07:module023:module4:module4"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module02:module5:module6"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module284:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module08:module19:module3"))
  implementation(project(":module16:module092:module1"))
  implementation(project(":module26:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module1"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
