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
    compose = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module091:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module218:module2"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module273:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module322:module03:module2"))
  api(project(":module07:module322:module01:module1"))
  api(project(":module07:module322:module04:module5"))
  api(project(":module07:module322:module06:module3"))
  api(project(":module07:module322:module07:module2"))
  api(project(":module07:module322:module09:module3"))
  api(project(":module07:module322:module10:module2"))
  api(project(":module07:module322:module11:module2"))
  api(project(":module07:module320:module7"))
  api(project(":module07:module332:module4"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module399"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module526:module1:module4"))
  api(project(":module07:module526:module3:module4"))
  api(project(":module07:module542:module2"))
  api("androidx.cardview:cardview:1.0.0")
  api("androidx.databinding:viewbinding:7.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module322:module02:module2"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module322:module03:module3"))
  testImplementation(project(":module07:module322:module04:module6"))
  testImplementation(project(":module07:module320:module8"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("app.cash.turbine:turbine:0.5.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
