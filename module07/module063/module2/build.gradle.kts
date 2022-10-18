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
  api(project(":module07:module050:module6"))
  api(project(":module07:module063:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module049:module4"))
  implementation(project(":module07:module052:module6"))
  implementation(project(":module07:module056:module2"))
  implementation(project(":module07:module057:module7"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module263:module5"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module07:module563:module2:module1"))
  implementation(project(":module16:module061:module1"))
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation(project(":module16:module061:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
