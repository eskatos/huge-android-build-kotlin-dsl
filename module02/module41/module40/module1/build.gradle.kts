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
  api(project(":module02:module41:module01:module1"))
  api(project(":module02:module41:module10:module1"))
  api(project(":module02:module41:module12:module1"))
  api(project(":module02:module41:module14:module1"))
  api(project(":module02:module41:module17:module1"))
  api(project(":module02:module41:module16:module4"))
  api(project(":module02:module41:module20:module2"))
  api(project(":module02:module41:module23:module1"))
  api(project(":module02:module41:module27:module1"))
  api(project(":module02:module41:module30:module1"))
  api(project(":module02:module41:module35:module1"))
  api(project(":module02:module41:module37:module1"))
  api(project(":module02:module41:module39:module1"))
  api(project(":module02:module48:module2"))
  api(project(":module07:module224:module7"))
  api(project(":module07:module331:module1"))
  api(project(":module07:module547:module4"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  api("junit:junit:4.13.2")
  api("org.robolectric:robolectric:4.7.3")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module02:module41:module02:module1"))
  testImplementation(project(":module02:module41:module01:module1"))
  testImplementation(project(":module02:module41:module01:module3"))
  testImplementation(project(":module02:module41:module06:module1"))
  testImplementation(project(":module02:module41:module06:module3"))
  testImplementation(project(":module02:module41:module14:module3"))
  testImplementation(project(":module02:module41:module28:module1"))
  testImplementation(project(":module02:module41:module38:module1"))
  testImplementation(project(":module02:module41:module41:module4"))
  testImplementation(project(":module02:module41:module42:module2"))
  testImplementation(project(":module02:module49:module1"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
