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
  api(project(":module05:module38:module3"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module078:module2"))
  api(project(":module07:module102"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module148:module12"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module252:module1"))
  api(project(":module07:module253:module4"))
  api(project(":module07:module254:module3"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module309:module2"))
  api(project(":module07:module400:module5"))
  api(project(":module07:module421:module6"))
  api(project(":module07:module440:module5"))
  api(project(":module08:module52:module7"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module135:module6"))
  implementation(project(":module07:module226:module5"))
  implementation(project(":module07:module337:module4"))
  implementation(project(":module07:module344:module4"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
