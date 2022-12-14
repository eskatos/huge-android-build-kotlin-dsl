plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
    buildConfig = true
    androidResources = true
    compose = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module05:module08:module1"))
  api(project(":module05:module14:module05"))
  api(project(":module05:module14:module14"))
  api(project(":module05:module22"))
  api(project(":module05:module23:module9"))
  api(project(":module05:module25:module6"))
  api(project(":module06:module19:module1:module3"))
  api(project(":module07:module002:module3"))
  api(project(":module07:module003:module2"))
  api(project(":module07:module003:module4"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module025:module3"))
  api(project(":module07:module029:module2"))
  api(project(":module07:module082:module2"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module156:module1"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module194"))
  api(project(":module07:module208:module8"))
  api(project(":module07:module306:module4"))
  api(project(":module07:module302:module6"))
  api(project(":module07:module311"))
  api(project(":module07:module316:module1"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module433"))
  api(project(":module07:module434"))
  api(project(":module07:module443:module4"))
  api(project(":module07:module446:module1"))
  api(project(":module07:module458:module2"))
  api(project(":module07:module468:module1"))
  api(project(":module07:module486"))
  api(project(":module07:module487"))
  api(project(":module07:module490:module5"))
  api(project(":module07:module495:module1"))
  api(project(":module07:module495:module2"))
  api(project(":module07:module509:module3"))
  api(project(":module07:module518:module03"))
  api(project(":module07:module518:module07"))
  api(project(":module07:module518:module09"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module521:module1"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module549:module2"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module554:module1"))
  api(project(":module07:module567:module2"))
  api(project(":module07:module569"))
  api(project(":module07:module570"))
  api(project(":module16:module061:module1"))
  api(project(":module23:module01:module07:module2"))
  api(project(":module23:module01:module08:module3"))
  api(project(":module23:module01:module29"))
  api(project(":module23:module01:module37"))
  api(project(":module23:module01:module36:module7"))
  api(project(":module23:module01:module50"))
  api(project(":module23:module07:module01:module1"))
  api(project(":module23:module07:module02:module2"))
  api(project(":module23:module07:module02:module4"))
  api(project(":module23:module07:module03:module2"))
  api(project(":module23:module07:module04:module1"))
  api(project(":module23:module07:module07:module2"))
  api(project(":module23:module07:module08:module1"))
  api(project(":module23:module07:module23:module2"))
  api(project(":module23:module07:module27"))
  api("androidx.activity:activity-ktx:1.3.1")
  api("androidx.core:core-ktx:1.7.0")
  api("androidx.databinding:viewbinding:7.3.1")
  api("androidx.recyclerview:recyclerview:1.0.0")
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  api("com.jakewharton.timber:timber:4.6.1")
  api("io.reactivex.rxjava2:rxandroid:2.1.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2")
  api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module565:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("com.jakewharton:process-phoenix:2.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module221:module1:module7"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module518:module11"))
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
