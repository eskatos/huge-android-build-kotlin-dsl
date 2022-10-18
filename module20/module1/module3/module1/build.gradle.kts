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
  api(project(":module01:module08"))
  api(project(":module07:module127"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module139"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module326:module2"))
  api(project(":module07:module368:module6"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module438:module1"))
  api(project(":module07:module517:module3"))
  api(project(":module07:module527"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module16:module031:module1"))
  api(project(":module20:module1:module3:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module288"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module029:module1"))
  implementation(project(":module16:module068:module1"))
  implementation(project(":module20:module1:module6:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module20:module1:module5:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
