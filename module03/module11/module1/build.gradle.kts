plugins {
  id("com.android.application")
  kotlin("android")
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
  androidTestImplementation(project(":module03:module11:module2"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module523:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation(project(":module07:module556"))
  androidTestImplementation(project(":module23:module01:module08:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  api(project(":module07:module002:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module11:module3"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module185:module1"))
  implementation(project(":module07:module185:module3"))
  implementation(project(":module07:module185:module4"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module313:module3"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module425:module1"))
  implementation(project(":module07:module468:module2"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module518:module03"))
  implementation(project(":module07:module518:module07"))
  implementation(project(":module07:module518:module09"))
  implementation(project(":module07:module523:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module07:module549:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module570"))
  implementation(project(":module23:module01:module08:module3"))
  implementation(project(":module23:module01:module13:module3"))
  implementation(project(":module23:module01:module16"))
  implementation(project(":module23:module01:module17:module1"))
  implementation(project(":module23:module01:module36:module7"))
  implementation(project(":module23:module01:module39:module2"))
  implementation(project(":module23:module01:module41"))
  implementation(project(":module23:module01:module45"))
  implementation(project(":module23:module01:module50"))
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
