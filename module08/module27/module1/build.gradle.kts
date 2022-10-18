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
  api(project(":module06:module05:module10:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module260:module4"))
  api(project(":module08:module27:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module091:module4"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module228:module4"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module270:module4"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module276:module4"))
  implementation(project(":module07:module277:module3"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module388:module4"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module425:module1"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module08:module11:module16:module4"))
  implementation(project(":module08:module11:module15:module2:module4"))
  implementation(project(":module16:module067:module1"))
  implementation(project(":module16:module092:module1"))
  implementation("ca.barrenechea.header-decor:header-decor:0.3-cash01")
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
