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
  api(project(":module05:module10:module3"))
  api(project(":module05:module14:module14"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module065:module7"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module178"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module232:module3"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module372:module4"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module527"))
  api(project(":module07:module534:module1"))
  api(project(":module07:module542:module2"))
  api(project(":module08:module12:module15:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module03"))
  implementation(project(":module01:module10:module1"))
  implementation(project(":module01:module16"))
  implementation(project(":module01:module19"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module06:module05:module04:module6"))
  implementation(project(":module06:module05:module21:module5"))
  implementation(project(":module06:module05:module23:module5"))
  implementation(project(":module06:module05:module26:module5"))
  implementation(project(":module06:module10:module2"))
  implementation(project(":module06:module16:module13"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module050:module6"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module226:module5"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module503:module5"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module06:module10:module2"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module291:module1"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
