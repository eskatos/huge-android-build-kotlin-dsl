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
  api(project(":module07:module009:module2"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module013:module4"))
  api(project(":module07:module029:module2"))
  api(project(":module07:module040:module5"))
  api(project(":module07:module093:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module184:module4"))
  api(project(":module07:module183:module10"))
  api(project(":module07:module185:module4"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module464:module6"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module542:module2"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.code.gson:gson:2.8.6")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
