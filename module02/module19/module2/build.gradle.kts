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
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module02:module01:module3"))
  api(project(":module02:module19:module6"))
  api(project(":module02:module41:module22:module1"))
  api(project(":module06:module12:module5"))
  api(project(":module07:module030:module2:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module425:module1"))
  api(project(":module08:module12:module09:module4"))
  api(project(":module08:module11:module03:module1"))
  api(project(":module08:module11:module11:module7"))
  api(project(":module08:module11:module18:module1:module7"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module3"))
  implementation(project(":module02:module07:module3"))
  implementation(project(":module02:module41:module01:module2"))
  implementation(project(":module02:module41:module10:module2"))
  implementation(project(":module02:module41:module21:module1"))
  implementation(project(":module02:module41:module27:module2"))
  implementation(project(":module02:module41:module30:module2"))
  implementation(project(":module02:module41:module36:module3"))
  implementation(project(":module02:module41:module37:module3"))
  implementation(project(":module02:module41:module38:module3"))
  implementation(project(":module02:module41:module41:module3"))
  implementation(project(":module02:module46:module3"))
  implementation(project(":module07:module125:module4"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module195:module11:module1"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module333:module5"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module499:module1"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module08:module10:module5"))
  implementation(project(":module08:module11:module04:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module02:module41:module02:module1"))
  testImplementation(project(":module02:module41:module01:module3"))
  testImplementation(project(":module02:module41:module10:module3"))
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation(project(":module02:module41:module27:module3"))
  testImplementation(project(":module02:module41:module30:module3"))
  testImplementation(project(":module02:module41:module38:module4"))
  testImplementation(project(":module02:module41:module40:module1"))
  testImplementation(project(":module02:module41:module41:module4"))
  testImplementation(project(":module02:module49:module1"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module08:module12:module05:module1"))
  testImplementation(project(":module08:module11:module03:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
