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
  api(project(":module07:module032:module7"))
  api(project(":module07:module090:module7"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module226:module5"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module418"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module449:module3"))
  api(project(":module07:module450:module3"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module519:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module46:module6"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module122:module2"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module339:module4"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module07:module563:module2:module1"))
  implementation(project(":module16:module010:module1"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module172:module1"))
  testImplementation(project(":module07:module172:module5"))
  testImplementation(project(":module07:module213:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module561:module1"))
  testImplementation(project(":module07:module563:module2:module1"))
  testImplementation("androidx.test:core:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
