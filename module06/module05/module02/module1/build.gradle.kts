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
  api(project(":module06:module04:module2"))
  api(project(":module06:module05:module01:module2"))
  api(project(":module06:module05:module02:module3"))
  api(project(":module06:module05:module08:module2"))
  api(project(":module06:module05:module16:module3"))
  api(project(":module06:module05:module26:module5"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module127"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module500:module4"))
  api(project(":module07:module501:module3"))
  api(project(":module07:module535:module3"))
  api(project(":module18:module04:module2:module2"))
  api(project(":module18:module10:module6:module3"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module05:module21:module5"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module385:module2"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
