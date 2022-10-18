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
  api(project(":module01:module16"))
  api(project(":module06:module19:module3:module2"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module344:module4"))
  api(project(":module07:module409"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module07:module4"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module108:module4"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module406:module4"))
  implementation(project(":module07:module418"))
  implementation(project(":module07:module424:module2"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module502:module2"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module529:module1"))
  implementation(project(":module07:module528:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module16:module028:module1"))
  implementation(project(":module16:module061:module1"))
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module532"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
