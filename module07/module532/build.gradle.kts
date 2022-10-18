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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module19:module3:module2"))
  implementation(project(":module07:module013:module5"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module128"))
  implementation(project(":module07:module150:module3"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module401"))
  implementation(project(":module07:module411:module4"))
  implementation(project(":module07:module419"))
  implementation(project(":module07:module420:module2"))
  implementation(project(":module07:module463:module3"))
  implementation(project(":module07:module467:module5"))
  implementation(project(":module07:module464:module7"))
  implementation(project(":module07:module468:module4"))
  implementation(project(":module07:module518:module11"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module528:module2"))
  implementation(project(":module07:module547:module4"))
  implementation(project(":module07:module549:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module01:module01"))
  testImplementation(project(":module06:module01:module3"))
  testImplementation(project(":module06:module19:module2:module3"))
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module025:module3"))
  testImplementation(project(":module07:module034"))
  testImplementation(project(":module07:module044"))
  testImplementation(project(":module07:module068"))
  testImplementation(project(":module07:module070"))
  testImplementation(project(":module07:module098:module1"))
  testImplementation(project(":module07:module099"))
  testImplementation(project(":module07:module109:module3"))
  testImplementation(project(":module07:module108:module4"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module181"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module195:module09:module3"))
  testImplementation(project(":module07:module240:module3"))
  testImplementation(project(":module07:module247:module2"))
  testImplementation(project(":module07:module424:module2"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module534:module1"))
  testImplementation(project(":module07:module535:module3"))
  testImplementation(project(":module07:module569"))
  testImplementation(project(":module16:module061:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
