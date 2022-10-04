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
  api(project(":module07:module077:module7"))
  api(project(":module07:module134:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module319:module3"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module542:module2"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module563:module1:module1"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module522:module4"))
  implementation("androidx.cardview:cardview:1.0.0")
  implementation("com.airbnb.android:lottie:3.4.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module133:module1"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("androidx.test:core:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
