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
  api(project(":module01:module01"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module219:module4"))
  api(project(":module07:module335:module3"))
  api(project(":module07:module350:module09"))
  api(project(":module07:module346:module3"))
  api(project(":module07:module392:module3"))
  api(project(":module07:module399"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module023:module3:module2"))
  implementation(project(":module07:module121:module5"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module318:module2"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module330:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module347:module2"))
  implementation(project(":module07:module353:module2"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module26:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module219:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module348:module1"))
  testImplementation(project(":module07:module353:module3"))
  testImplementation(project(":module07:module350:module02"))
  testImplementation(project(":module07:module350:module10"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
