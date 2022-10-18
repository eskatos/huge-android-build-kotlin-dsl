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
  api(project(":module07:module549:module3"))
  api("com.google.truth:truth:1.1.3")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module099"))
  implementation(project(":module07:module109:module3"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module132:module7"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module298:module1"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module401"))
  implementation(project(":module07:module420:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module547:module4"))
  implementation(project(":module07:module549:module4"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.mockito:mockito-core:3.12.4")
  testImplementation(project(":module06:module07:module4"))
  testImplementation(project(":module07:module025:module6"))
  testImplementation(project(":module07:module072:module1"))
  testImplementation(project(":module07:module132:module6"))
  testImplementation(project(":module07:module147:module2"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module195:module09:module1"))
  testImplementation(project(":module07:module201:module1"))
  testImplementation(project(":module07:module240:module1"))
  testImplementation(project(":module07:module247:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module424:module2"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module467:module4"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module561:module1"))
  testImplementation(project(":module16:module025:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
}
