plugins {
  id("com.android.library")
  kotlin("android")
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
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module01:module03"))
  api(project(":module01:module16"))
  api(project(":module05:module03:module2"))
  api(project(":module05:module14:module14"))
  api(project(":module07:module235:module1"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module495:module2"))
  api(project(":module07:module508"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module12:module3"))
  implementation(project(":module01:module13"))
  implementation(project(":module01:module16"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module12:module3"))
  implementation(project(":module05:module17:module1"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module05:module23:module9"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module06:module12:module5"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module104"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module192"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module216:module5"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module383:module3"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module433"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module510:module1"))
  implementation(project(":module07:module509:module3"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module551"))
  implementation(project(":module07:module557"))
  implementation(project(":module16:module061:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module05:module01:module3"))
  testImplementation(project(":module05:module06:module1"))
  testImplementation(project(":module05:module14:module04"))
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module101"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module445:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
