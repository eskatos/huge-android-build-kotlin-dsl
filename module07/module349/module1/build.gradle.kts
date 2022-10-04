plugins {
  id("com.android.library")
  kotlin("android")
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
  api(project(":module07:module016:module5"))
  api(project(":module07:module074:module3"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module188:module3"))
  api(project(":module07:module349:module4"))
  api(project(":module07:module346:module3"))
  api(project(":module07:module400:module5"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module10:module1"))
  implementation(project(":module01:module19"))
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module023:module1:module1"))
  implementation(project(":module07:module023:module3:module2"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module075"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module104"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module180:module2"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module235:module1"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module318:module2"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module393:module2"))
  implementation(project(":module07:module407:module3"))
  implementation(project(":module07:module409"))
  implementation(project(":module07:module418"))
  implementation(project(":module07:module454"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module08:module52:module7"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
