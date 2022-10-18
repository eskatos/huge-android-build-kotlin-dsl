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
  api(project(":module05:module07"))
  api(project(":module05:module14:module13"))
  api(project(":module05:module14:module14"))
  api(project(":module05:module32:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module518:module10"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module02:module4"))
  implementation(project(":module05:module04:module2"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module08:module2"))
  implementation(project(":module05:module11:module6"))
  implementation(project(":module05:module12:module1"))
  implementation(project(":module05:module12:module3"))
  implementation(project(":module05:module16:module3"))
  implementation(project(":module05:module21"))
  implementation(project(":module05:module23:module9"))
  implementation(project(":module05:module25:module6"))
  implementation(project(":module05:module26:module5"))
  implementation(project(":module05:module35"))
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module076:module4"))
  implementation(project(":module07:module170:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module216:module5"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module563:module3:module1"))
  implementation(project(":module16:module012:module1"))
  implementation(project(":module16:module103:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module05:module26:module6"))
  testImplementation(project(":module07:module025:module6"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
