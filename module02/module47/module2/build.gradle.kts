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
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module02:module47:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module506:module2"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module3"))
  implementation(project(":module02:module42:module1"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module237:module7"))
  implementation(project(":module07:module258:module3"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.google.android.material:material:1.2.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module02:module41:module42:module2"))
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
