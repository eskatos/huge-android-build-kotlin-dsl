plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module01:module01"))
  api(project(":module01:module04:module1"))
  api(project(":module07:module016:module5"))
  api(project(":module07:module033:module2"))
  api(project(":module07:module091:module4"))
  api(project(":module07:module151:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module206"))
  api(project(":module07:module207:module2"))
  api(project(":module07:module219:module4"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module265:module2"))
  api(project(":module07:module292:module3"))
  api(project(":module07:module362:module3"))
  api(project(":module07:module363:module6"))
  api(project(":module07:module364:module5"))
  api(project(":module07:module361:module6"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module506:module2"))
  api(project(":module07:module519:module1"))
  api(project(":module07:module536:module5"))
  api(project(":module07:module562:module2"))
  api(project(":module07:module570"))
  api(project(":module08:module18:module2"))
  api(project(":module08:module23:module2"))
  api(project(":module08:module52:module7"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module024:module5"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module115:module2"))
  implementation(project(":module07:module119:module3"))
  implementation(project(":module07:module114:module2"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module201:module2"))
  implementation(project(":module07:module248:module1"))
  implementation(project(":module07:module278:module3"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module290:module3"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module293:module5"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module358:module5"))
  implementation(project(":module07:module360:module3"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module08:module02:module4"))
  implementation(project(":module08:module03:module2"))
  implementation(project(":module08:module05:module5"))
  implementation(project(":module08:module14:module4"))
  implementation(project(":module08:module22:module4"))
  implementation(project(":module16:module069:module1"))
  implementation("com.github.chrisbanes:PhotoView:2.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module312"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
