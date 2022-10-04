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
  api(project(":module07:module175:module1"))
  api(project(":module19:module2:module33:module4"))
  api(project(":module19:module2:module32:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module147:module8"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module293:module5"))
  implementation(project(":module07:module292:module3"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module08:module38:module01:module1"))
  implementation(project(":module08:module38:module02:module2"))
  implementation(project(":module08:module38:module07:module6"))
  implementation(project(":module08:module38:module12:module2"))
  implementation(project(":module08:module38:module16:module3"))
  implementation(project(":module19:module1:module01:module3"))
  implementation(project(":module19:module1:module11:module5"))
  implementation(project(":module19:module1:module12:module2"))
  implementation(project(":module19:module1:module22:module3"))
  implementation(project(":module19:module2:module43:module6"))
  implementation(project(":module19:module2:module45:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module08:module38:module05:module1"))
  testImplementation(project(":module19:module2:module45:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
