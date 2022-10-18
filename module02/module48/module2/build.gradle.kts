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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module02:module48:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module188:module3"))
  api(project(":module07:module247:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module10:module2"))
  implementation(project(":module02:module26:module4"))
  implementation(project(":module02:module41:module10:module2"))
  implementation(project(":module02:module41:module17:module2"))
  implementation(project(":module02:module41:module16:module3"))
  implementation(project(":module02:module41:module20:module1"))
  implementation(project(":module02:module41:module30:module2"))
  implementation(project(":module02:module41:module34:module2"))
  implementation(project(":module02:module41:module38:module3"))
  implementation(project(":module02:module41:module39:module1"))
  implementation(project(":module02:module41:module42:module1"))
  implementation(project(":module02:module42:module1"))
  implementation(project(":module02:module47:module4"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module043"))
  implementation(project(":module07:module147:module8"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module16:module004:module1"))
  implementation("androidx.sqlite:sqlite-framework:2.1.0")
  implementation("com.evernote:android-job:1.4.3")
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module044"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
