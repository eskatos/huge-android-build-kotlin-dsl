plugins {
  id("com.android.library")
  kotlin("android")
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
    buildConfig = true
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module02"))
  api(project(":module01:module14"))
  api(project(":module01:module18"))
  api(project(":module05:module17:module1"))
  api(project(":module06:module05:module21:module5"))
  api(project(":module07:module005:module2"))
  api(project(":module07:module022:module6:module4"))
  api(project(":module07:module022:module6:module5"))
  api(project(":module07:module016:module5"))
  api(project(":module07:module049:module4"))
  api(project(":module07:module050:module6"))
  api(project(":module07:module056:module2"))
  api(project(":module07:module081:module4"))
  api(project(":module07:module090:module7"))
  api(project(":module07:module091:module4"))
  api(project(":module07:module109:module3"))
  api(project(":module07:module119:module2"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module178"))
  api(project(":module07:module195:module10:module2:module4"))
  api(project(":module07:module195:module10:module4:module3"))
  api(project(":module07:module197:module4"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module239:module3"))
  api(project(":module07:module239:module4"))
  api(project(":module07:module308:module3"))
  api(project(":module07:module362:module3"))
  api(project(":module07:module363:module6"))
  api(project(":module07:module364:module5"))
  api(project(":module07:module371:module4"))
  api(project(":module07:module375:module4"))
  api(project(":module07:module376:module1:module5"))
  api(project(":module07:module377:module3"))
  api(project(":module07:module416:module5"))
  api(project(":module07:module421:module6"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module444:module4"))
  api(project(":module07:module470:module2"))
  api(project(":module07:module470:module3"))
  api(project(":module07:module475:module2"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module503:module4"))
  api(project(":module07:module524:module3"))
  api(project(":module07:module524:module4"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module559:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module08:module07"))
  api(project(":module08:module12:module14:module4"))
  api(project(":module08:module51:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module16"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module05:module13:module3"))
  implementation(project(":module05:module26:module5"))
  implementation(project(":module05:module28:module4"))
  implementation(project(":module05:module30:module9"))
  implementation(project(":module05:module34:module7"))
  implementation(project(":module06:module12:module5"))
  implementation(project(":module06:module19:module1:module3"))
  implementation(project(":module06:module19:module2:module3"))
  implementation(project(":module07:module023:module1:module1"))
  implementation(project(":module07:module027:module1"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module118:module3"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module146:module3"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module180:module2"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module10:module1:module6"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module219:module4"))
  implementation(project(":module07:module235:module1"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module263:module5"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module318:module2"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module332:module4"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module07:module406:module4"))
  implementation(project(":module07:module409"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module414:module2"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module474"))
  implementation(project(":module07:module489:module4"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module509:module3"))
  implementation(project(":module07:module520:module3"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module52:module7"))
  implementation(project(":module08:module53"))
  implementation(project(":module16:module069:module1"))
  implementation(project(":module16:module081:module1"))
  implementation("com.github.chrisbanes:PhotoView:2.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module05:module34:module1"))
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module108:module4"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module213:module1"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module219:module1"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module316:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module421:module2"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module469:module2"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module503:module6"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
