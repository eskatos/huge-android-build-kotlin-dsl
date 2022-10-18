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
  api(project(":module06:module19:module2:module3"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module118:module3"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module240:module3"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module363:module6"))
  api(project(":module07:module466:module1"))
  api(project(":module07:module502:module2"))
  api(project(":module07:module501:module3"))
  api(project(":module16:module011:module2"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module104:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module561:module1"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
