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
  api(project(":module05:module19:module4"))
  api(project(":module06:module19:module1:module3"))
  api(project(":module07:module017:module2"))
  api(project(":module07:module020:module2"))
  api(project(":module07:module022:module3:module5"))
  api(project(":module07:module050:module6"))
  api(project(":module07:module086:module6"))
  api(project(":module07:module171:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module10:module1:module6"))
  api(project(":module07:module259:module1"))
  api(project(":module07:module268:module2"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module334:module1"))
  api(project(":module07:module344:module4"))
  api(project(":module07:module355:module2"))
  api(project(":module07:module357:module2"))
  api(project(":module07:module359:module4"))
  api(project(":module07:module374:module3"))
  api(project(":module07:module377:module3"))
  api(project(":module07:module429:module6"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module473:module2"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module479:module2"))
  api(project(":module07:module476:module4"))
  api(project(":module07:module491:module4"))
  api(project(":module07:module512:module7"))
  api(project(":module07:module513:module4"))
  api(project(":module07:module544:module3"))
  api(project(":module08:module10:module5"))
  api(project(":module08:module16:module2"))
  api(project(":module08:module28:module5"))
  api(project(":module08:module34:module2"))
  api(project(":module08:module39:module2"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module47:module1"))
  api(project(":module08:module48:module1"))
  api(project(":module08:module49:module1"))
  api(project(":module08:module50:module1"))
  api(project(":module08:module56:module2"))
  api(project(":module08:module63:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module308:module3"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module10:module2"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
