plugins {
  id("com.android.library")
  kotlin("android")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module05:module21"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module082:module2"))
  api(project(":module07:module095:module6"))
  api(project(":module07:module208:module8"))
  api(project(":module07:module246"))
  api(project(":module07:module304:module6"))
  api(project(":module07:module306:module4"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module342:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module453:module1"))
  api(project(":module07:module486"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module569"))
  api(project(":module07:module570"))
  api(project(":module16:module031:module1"))
  api(project(":module16:module061:module1"))
  api(project(":module23:module07:module04:module1"))
  api(project(":module23:module07:module08:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module221:module1:module7"))
  implementation(project(":module07:module240:module3"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module385:module2"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module487"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module23:module01:module50"))
  implementation("com.google.zxing:core:3.4.1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
