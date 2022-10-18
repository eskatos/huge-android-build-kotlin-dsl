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
  api(project(":module06:module01:module3"))
  api(project(":module06:module05:module02:module3"))
  api(project(":module06:module05:module04:module6"))
  api(project(":module06:module05:module05:module5"))
  api(project(":module06:module05:module06:module4"))
  api(project(":module06:module05:module07:module2"))
  api(project(":module06:module05:module08:module2"))
  api(project(":module06:module05:module10:module3"))
  api(project(":module06:module05:module13:module3"))
  api(project(":module06:module05:module17:module4"))
  api(project(":module06:module05:module25:module2"))
  api(project(":module06:module05:module23:module5"))
  api(project(":module06:module05:module26:module5"))
  api(project(":module06:module07:module4"))
  api(project(":module06:module14:module4"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module127"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module174:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module384:module3"))
  api(project(":module07:module420:module2"))
  api(project(":module07:module490:module5"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module18:module01:module3"))
  api(project(":module18:module04:module2:module2"))
  api(project(":module18:module10:module6:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module109:module3"))
  implementation(project(":module07:module106:module5"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module240:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module06:module07:module5"))
  testImplementation(project(":module07:module298:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
