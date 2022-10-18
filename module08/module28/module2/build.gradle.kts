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
  api(project(":module01:module04:module1"))
  api(project(":module07:module024:module5"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module562:module2"))
  api(project(":module08:module28:module5"))
  api(project(":module16:module028:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module115:module2"))
  implementation(project(":module07:module114:module2"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module197:module4"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module206"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module436:module5"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module506:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module559:module1"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module08:module09:module3"))
  implementation(project(":module08:module20:module3"))
  implementation(project(":module08:module22:module4"))
  implementation(project(":module08:module23:module2"))
  implementation(project(":module08:module54:module3"))
  implementation(project(":module16:module069:module1"))
  implementation("asia.ivity.android:drag-sort-listview:1.0-jetified")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module312"))
  testImplementation(project(":module07:module324:module1"))
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
