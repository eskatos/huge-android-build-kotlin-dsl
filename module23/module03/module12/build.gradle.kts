plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module07:module175:module1"))
  api(project(":module07:module232:module3"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module431:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module16"))
  implementation(project(":module05:module38:module3"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module385:module2"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module468:module1"))
  implementation(project(":module07:module536:module5"))
  implementation(project(":module07:module570"))
  implementation(project(":module08:module12:module15:module3"))
  implementation(project(":module08:module30"))
  implementation(project(":module08:module58"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module23:module01:module08:module6"))
  implementation(project(":module23:module01:module50"))
  implementation(project(":module23:module03:module06"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module06:module02:module3"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
