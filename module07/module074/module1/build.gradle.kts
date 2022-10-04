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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module11:module3"))
  api(project(":module06:module07:module4"))
  api(project(":module07:module074:module3"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module5"))
  api(project(":module07:module211:module5"))
  api(project(":module07:module237:module7"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module441:module1"))
  api(project(":module07:module527"))
  api(project(":module17:module1"))
  api("com.bugsnag:bugsnag-android:5.0.0")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module15"))
  implementation(project(":module01:module19"))
  implementation(project(":module05:module31:module6"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module07:module005:module2"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module109:module3"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module162"))
  implementation(project(":module07:module161:module1"))
  implementation(project(":module07:module186:module5"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module253:module4"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module282:module5"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module368:module6"))
  implementation(project(":module07:module383:module3"))
  implementation(project(":module07:module389:module4"))
  implementation(project(":module07:module405:module4"))
  implementation(project(":module07:module420:module2"))
  implementation(project(":module07:module423:module1"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module448:module4"))
  implementation(project(":module07:module512:module7"))
  implementation(project(":module07:module521:module1"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module547:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module047:module3"))
  testImplementation(project(":module07:module070"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module195:module09:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
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
  testImplementation("org.robolectric:robolectric:4.7.3")
}
