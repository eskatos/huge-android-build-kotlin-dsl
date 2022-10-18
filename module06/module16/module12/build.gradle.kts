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
  api(project(":module01:module03"))
  api(project(":module01:module10:module1"))
  api(project(":module01:module16"))
  api(project(":module06:module01:module3"))
  api(project(":module06:module04:module2"))
  api(project(":module06:module05:module04:module6"))
  api(project(":module06:module07:module4"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module127"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module18:module04:module2:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module173:module1:module1"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module418"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module07:module563:module2:module1"))
  implementation(project(":module08:module41:module6"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module06:module07:module5"))
  testImplementation(project(":module07:module181"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
