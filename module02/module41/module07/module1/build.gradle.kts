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
  api(project(":module02:module07:module3"))
  api(project(":module02:module41:module07:module3"))
  api(project(":module02:module41:module31:module1"))
  api(project(":module06:module12:module5"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module20:module4"))
  implementation(project(":module02:module33:module1"))
  implementation(project(":module02:module41:module06:module2"))
  implementation(project(":module02:module41:module09:module2"))
  implementation(project(":module02:module41:module10:module2"))
  implementation(project(":module02:module41:module14:module2"))
  implementation(project(":module02:module41:module16:module3"))
  implementation(project(":module02:module41:module23:module3"))
  implementation(project(":module02:module41:module27:module2"))
  implementation(project(":module02:module41:module32:module2"))
  implementation(project(":module02:module41:module41:module3"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module16:module011:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module02:module41:module01:module3"))
  testImplementation(project(":module02:module41:module20:module2"))
  testImplementation(project(":module02:module41:module38:module4"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
