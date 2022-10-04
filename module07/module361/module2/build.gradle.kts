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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module06:module19:module3:module2"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module332:module4"))
  api(project(":module07:module361:module6"))
  api(project(":module07:module463:module2"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module172:module4"))
  implementation(project(":module07:module204:module2"))
  implementation(project(":module07:module209:module3"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
