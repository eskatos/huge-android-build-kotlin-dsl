plugins {
  id("com.android.library")
  kotlin("android")
  id("org.jetbrains.kotlin.kapt")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module222:module1"))
  api(project(":module18:module01:module1"))
  api(project(":module18:module01:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module05:module1"))
  implementation(project(":module05:module14:module11"))
  implementation(project(":module05:module35"))
  implementation(project(":module07:module121:module4"))
  implementation(project(":module07:module147:module7"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module162"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module188:module1"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module247:module1"))
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module257:module2"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module298:module5"))
  implementation(project(":module07:module298:module6"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module395:module2"))
  implementation(project(":module07:module422:module2"))
  implementation(project(":module07:module464:module5"))
  implementation(project(":module07:module468:module1"))
  implementation(project(":module07:module495:module1"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module518:module03"))
  implementation(project(":module07:module518:module05"))
  implementation(project(":module07:module518:module07"))
  implementation(project(":module07:module518:module09"))
  implementation(project(":module07:module521:module1"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module07:module549:module2"))
  implementation(project(":module12:module08"))
  implementation(project(":module18:module02:module1"))
  implementation(project(":module18:module04:module2:module1"))
  implementation(project(":module18:module10:module4:module2"))
  implementation(project(":module18:module10:module6:module3"))
  implementation(project(":module18:module11:module1:module2"))
  implementation(project(":module18:module11:module2:module1"))
  implementation(project(":module18:module11:module3:module1"))
  implementation(project(":module18:module11:module4:module2"))
  implementation(project(":module18:module12:module1"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.lifecycle:lifecycle-common-java8:2.4.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module518:module11"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
