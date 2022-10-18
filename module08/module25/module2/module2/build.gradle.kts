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
  api(project(":module07:module175:module1"))
  api(project(":module07:module415:module4"))
  api(project(":module07:module549:module3"))
  api(project(":module08:module25:module2:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module283:module5"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module527"))
  implementation(project(":module16:module066:module1"))
  implementation("androidx.sqlite:sqlite-framework:2.1.0")
  implementation("androidx.sqlite:sqlite:2.1.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation("androidx.test:core:1.4.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
