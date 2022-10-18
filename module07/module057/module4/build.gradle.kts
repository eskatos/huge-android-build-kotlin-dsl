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
    androidResources = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module057:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module310:module4"))
  api(project(":module07:module454"))
  api("androidx.databinding:viewbinding:7.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module05:module10:module3"))
  implementation(project(":module07:module023:module4:module4"))
  implementation(project(":module07:module049:module4"))
  implementation(project(":module07:module050:module6"))
  implementation(project(":module07:module052:module6"))
  implementation(project(":module07:module053:module4"))
  implementation(project(":module07:module054:module5"))
  implementation(project(":module07:module056:module2"))
  implementation(project(":module07:module058:module3"))
  implementation(project(":module07:module059:module4"))
  implementation(project(":module07:module061:module5"))
  implementation(project(":module07:module064:module4"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module133:module7"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module229:module4:module5"))
  implementation(project(":module07:module263:module5"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module319:module3"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module420:module2"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module16:module061:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module053:module5"))
  testImplementation(project(":module07:module057:module8"))
  testImplementation(project(":module07:module194"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module463:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module16:module061:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
