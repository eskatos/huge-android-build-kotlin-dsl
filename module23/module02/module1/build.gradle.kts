plugins {
  id("com.android.application")
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
  }
}
dependencies {
  androidTestImplementation(project(":module03:module08:module1:module1"))
  androidTestImplementation(project(":module07:module041:module5"))
  androidTestImplementation(project(":module07:module186:module3"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module340"))
  androidTestImplementation(project(":module07:module404:module1:module2"))
  androidTestImplementation(project(":module07:module496"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module556"))
  androidTestImplementation(project(":module09:module1"))
  androidTestImplementation(project(":module09:module2"))
  androidTestImplementation(project(":module23:module01:module27:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module08:module1:module2"))
  implementation(project(":module05:module06:module5"))
  implementation(project(":module07:module008:module1"))
  implementation(project(":module07:module074:module2"))
  implementation(project(":module07:module121:module4"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module185:module3"))
  implementation(project(":module07:module186:module5"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module301:module3"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module313:module3"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module422:module2"))
  implementation(project(":module07:module425:module1"))
  implementation(project(":module07:module521:module1"))
  implementation(project(":module07:module548:module1"))
  implementation(project(":module23:module01:module03"))
  implementation(project(":module23:module01:module06:module2"))
  implementation(project(":module23:module01:module08:module3"))
  implementation(project(":module23:module01:module26:module1"))
  implementation(project(":module23:module01:module27:module7"))
  implementation(project(":module23:module01:module39:module2"))
  implementation(project(":module23:module01:module46"))
  implementation(project(":module23:module01:module49:module2"))
  implementation(project(":module23:module02:module2:module5"))
  implementation(project(":module23:module02:module4:module5"))
  implementation(project(":module23:module02:module5:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
