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
  api(project(":module01:module15"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module032:module7"))
  api(project(":module07:module164:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module178"))
  api(project(":module07:module215"))
  api(project(":module07:module219:module4"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module372:module4"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module534:module1"))
  api(project(":module08:module12:module15:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module16"))
  implementation(project(":module07:module024:module5"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module08:module20:module3"))
  implementation(project(":module08:module28:module5"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
