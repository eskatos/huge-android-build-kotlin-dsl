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
  api(project(":module07:module016:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module5"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module237:module7"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module347:module2"))
  api(project(":module07:module346:module3"))
  api(project(":module07:module392:module3"))
  api(project(":module07:module445:module1"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module021:module1"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module330:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module353:module2"))
  implementation(project(":module07:module394:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module07:module566:module2"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
