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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module098:module1"))
  api(project(":module07:module549:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module067:module1"))
  implementation(project(":module07:module072:module1"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module128"))
  implementation(project(":module07:module298:module1"))
  implementation(project(":module07:module411:module4"))
  implementation(project(":module07:module463:module3"))
  implementation(project(":module07:module467:module1"))
  implementation(project(":module07:module467:module5"))
  implementation(project(":module07:module464:module7"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module528:module2"))
  implementation(project(":module07:module547:module4"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module06:module19:module3:module2"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module311"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module532"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
}
