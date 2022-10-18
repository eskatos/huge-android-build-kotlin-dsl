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
  api(project(":module07:module023:module2:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module466:module1"))
  api(project(":module07:module464:module6"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module505:module1"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module16:module061:module1"))
  api(project(":module16:module064:module1"))
  api(project(":module16:module078:module1"))
  api(project(":module16:module079:module1"))
  api(project(":module16:module098:module1"))
  api(project(":module16:module103:module1"))
  api(project(":module16:module107:module1"))
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module16:module069:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
