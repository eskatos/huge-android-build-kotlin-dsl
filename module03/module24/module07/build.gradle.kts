plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module017:module2"))
  api(project(":module07:module050:module6"))
  api(project(":module07:module171:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module334:module1"))
  api(project(":module07:module357:module2"))
  api(project(":module07:module374:module3"))
  api(project(":module07:module473:module2"))
  api(project(":module07:module512:module7"))
  api(project(":module08:module10:module5"))
  api(project(":module08:module16:module2"))
  api(project(":module08:module28:module5"))
  api(project(":module08:module34:module2"))
  api(project(":module08:module39:module2"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module47:module1"))
  api(project(":module08:module48:module1"))
  api(project(":module08:module49:module1"))
  api(project(":module08:module50:module1"))
  api(project(":module08:module56:module2"))
  api(project(":module08:module63:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
