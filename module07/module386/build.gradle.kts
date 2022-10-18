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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module067:module1"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module527"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module07:module4"))
  implementation(project(":module07:module147:module9"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module383:module3"))
  implementation(project(":module07:module406:module4"))
  implementation(project(":module07:module418"))
  implementation(project(":module07:module419"))
  implementation(project(":module07:module464:module7"))
  implementation(project(":module07:module468:module4"))
  implementation(project(":module07:module518:module11"))
  implementation(project(":module07:module528:module2"))
  implementation(project(":module07:module532"))
  implementation(project(":module07:module547:module4"))
  implementation("junit:junit:4.13.2")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.mockito:mockito-core:3.12.4")
  implementation("org.robolectric:robolectric:4.7.3")
  testImplementation(project(":module07:module068"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module247:module2"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module529:module1"))
  testImplementation(project(":module07:module528:module3"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
