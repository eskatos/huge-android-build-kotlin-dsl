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
  api(project(":module01:module16"))
  api(project(":module05:module10:module3"))
  api(project(":module07:module015:module3"))
  api(project(":module07:module066:module6"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module160:module2"))
  api(project(":module07:module164:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module05:module5:module3"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module208:module8"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module219:module4"))
  api(project(":module07:module232:module3"))
  api(project(":module07:module238:module3"))
  api(project(":module07:module243:module8"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module266:module2"))
  api(project(":module07:module279:module1"))
  api(project(":module07:module280:module5"))
  api(project(":module07:module335:module3"))
  api(project(":module07:module333:module5"))
  api(project(":module07:module337:module4"))
  api(project(":module07:module369:module3"))
  api(project(":module07:module390:module4"))
  api(project(":module07:module403:module1:module5"))
  api(project(":module07:module403:module4:module2"))
  api(project(":module07:module428:module4"))
  api(project(":module07:module461:module4"))
  api(project(":module07:module526:module1:module4"))
  api(project(":module07:module536:module5"))
  api(project(":module07:module535:module3"))
  api(project(":module08:module12:module01:module5"))
  api(project(":module08:module12:module02:module1:module3"))
  api(project(":module08:module12:module02:module2:module3"))
  api(project(":module08:module12:module04:module3"))
  api(project(":module08:module12:module07:module3"))
  api(project(":module08:module12:module10:module3"))
  api(project(":module08:module12:module12:module3"))
  api(project(":module08:module12:module13:module3"))
  api(project(":module08:module12:module15:module3"))
  api(project(":module08:module11:module01:module1:module5"))
  api(project(":module08:module11:module01:module3:module3"))
  api(project(":module08:module11:module01:module4:module3"))
  api(project(":module08:module11:module06:module4"))
  api(project(":module08:module11:module11:module7"))
  api(project(":module08:module11:module12:module4"))
  api(project(":module08:module11:module14:module1:module3"))
  api(project(":module08:module11:module19:module3"))
  api(project(":module08:module11:module20:module3"))
  api(project(":module08:module62:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module19"))
  implementation(project(":module07:module125:module4"))
  implementation(project(":module07:module195:module01:module3"))
  implementation(project(":module07:module195:module02:module1:module2"))
  implementation(project(":module07:module195:module02:module7:module6"))
  implementation(project(":module07:module195:module02:module8:module6"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module370:module3"))
  implementation(project(":module07:module428:module4"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module09:module3"))
  implementation(project(":module08:module12:module02:module2:module3"))
  implementation(project(":module08:module12:module11:module3"))
  implementation(project(":module08:module11:module01:module4:module3"))
  implementation(project(":module08:module11:module01:module7:module5"))
  implementation(project(":module08:module11:module02:module4"))
  implementation(project(":module08:module11:module04:module1"))
  implementation(project(":module08:module11:module05:module3"))
  implementation(project(":module08:module11:module07:module4"))
  implementation(project(":module08:module11:module09:module3"))
  implementation(project(":module08:module11:module12:module4"))
  implementation(project(":module08:module11:module14:module1:module3"))
  implementation(project(":module08:module11:module14:module2:module3"))
  implementation(project(":module08:module11:module14:module3:module4"))
  implementation(project(":module08:module11:module16:module4"))
  implementation(project(":module08:module11:module20:module3"))
  implementation(project(":module08:module59"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module156:module2"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module219:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module08:module12:module08:module1"))
  testImplementation(project(":module08:module12:module13:module1"))
  testImplementation(project(":module08:module11:module03:module2"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
