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
  api(project(":module07:module130:module4"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module379:module2"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module512:module7"))
  api(project(":module07:module515:module7"))
  api(project(":module07:module562:module2"))
  api(project(":module07:module563:module1:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module011:module5"))
  implementation(project(":module07:module016:module5"))
  implementation(project(":module07:module032:module7"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module219:module4"))
  implementation(project(":module07:module258:module3"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module514:module5"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module07:module567:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module213:module1"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module512:module2"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("androidx.test:core:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
