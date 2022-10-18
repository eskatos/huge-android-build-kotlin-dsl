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
  api(project(":module07:module077:module7"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module319:module3"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module33:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module519:module1"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module344:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
