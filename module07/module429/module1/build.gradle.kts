plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
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
  androidTestImplementation(project(":module07:module013:module2"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module220:module7"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module429:module4"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-intents:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module121:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module220:module4"))
  api(project(":module07:module429:module6"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module022:module5:module2"))
  implementation(project(":module07:module022:module8:module1"))
  implementation(project(":module07:module016:module3"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module039:module4"))
  implementation(project(":module07:module130:module4"))
  implementation(project(":module07:module171:module2"))
  implementation(project(":module07:module171:module4"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module259:module1"))
  implementation(project(":module07:module327:module2"))
  implementation(project(":module07:module327:module4"))
  implementation(project(":module07:module335:module1"))
  implementation(project(":module07:module333:module3"))
  implementation(project(":module07:module346:module3"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module417:module3"))
  implementation(project(":module07:module422:module1"))
  implementation(project(":module07:module429:module5"))
  implementation(project(":module07:module480:module1"))
  implementation(project(":module07:module485:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module07:module548:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module61:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
