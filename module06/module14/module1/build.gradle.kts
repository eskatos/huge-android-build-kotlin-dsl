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
  api(project(":module06:module14:module4"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module05:module05:module5"))
  implementation(project(":module06:module05:module16:module3"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module143:module4"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module16:module031:module1"))
  implementation(project(":module18:module01:module3"))
  implementation(project(":module18:module04:module2:module2"))
  implementation(project(":module18:module10:module6:module3"))
  implementation(project(":module18:module11:module4:module2"))
  implementation(project(":module18:module12:module1"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module06:module07:module5"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
