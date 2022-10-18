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
  api(project(":module05:module11:module6"))
  api(project(":module05:module12:module3"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module549:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module3"))
  implementation(project(":module05:module02:module4"))
  implementation(project(":module05:module03:module2"))
  implementation(project(":module05:module04:module2"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module17:module1"))
  implementation(project(":module05:module23:module9"))
  implementation(project(":module05:module26:module5"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module046:module2"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module258:module3"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module468:module1"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module16:module012:module1"))
  implementation(project(":module16:module102:module1"))
  implementation(project(":module16:module103:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module05:module01:module3"))
  testImplementation(project(":module05:module06:module1"))
  testImplementation(project(":module05:module25:module2"))
  testImplementation(project(":module05:module25:module6"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module433"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module16:module078:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
