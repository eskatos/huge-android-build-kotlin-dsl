plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module07:module091:module4"))
  api(project(":module07:module127"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module176:module6"))
  api(project(":module07:module228:module4"))
  api(project(":module07:module264:module6"))
  api(project(":module07:module274:module1"))
  api(project(":module07:module275:module1"))
  api(project(":module07:module287:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module557"))
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module154:module6"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module410:module4"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module067:module1"))
  implementation(project(":module16:module085:module1"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
