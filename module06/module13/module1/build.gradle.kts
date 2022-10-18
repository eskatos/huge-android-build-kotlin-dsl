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
  api(project(":module01:module19"))
  api(project(":module06:module05:module12:module3"))
  api(project(":module06:module13:module3"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module17:module1"))
  implementation(project(":module05:module14:module14"))
  implementation(project(":module06:module05:module15:module5"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module06:module12:module5"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module094:module2"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module174:module4"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module07:module489:module4"))
  implementation(project(":module07:module527"))
  implementation(project(":module08:module41:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module06:module07:module5"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
