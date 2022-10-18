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
  api(project(":module01:module07"))
  api(project(":module06:module07:module4"))
  api(project(":module06:module19:module3:module2"))
  api(project(":module07:module072:module3"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module114:module2"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module06:module1"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module291:module1"))
  api(project(":module07:module311"))
  api(project(":module07:module368:module6"))
  api(project(":module07:module381:module3"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module16:module052:module1"))
  api(project(":module16:module067:module1"))
  api(project(":module16:module081:module1"))
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.threetenabp:threetenabp:1.4.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module368:module3"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module213:module6"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
