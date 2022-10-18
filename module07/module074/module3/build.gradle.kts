plugins {
  id("com.android.library")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module06:module02:module3"))
  api(project(":module07:module026:module2"))
  api(project(":module07:module025:module6"))
  api(project(":module07:module034"))
  api(project(":module07:module091:module4"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module192"))
  api(project(":module07:module194"))
  api(project(":module07:module235:module1"))
  api(project(":module07:module249"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module298:module7"))
  api(project(":module07:module335:module3"))
  api(project(":module07:module372:module4"))
  api(project(":module07:module391"))
  api(project(":module07:module454"))
  api(project(":module07:module510:module1"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module551"))
  api(project(":module07:module557"))
  api(project(":module07:module562:module2"))
  api("androidx.work:work-runtime-ktx:2.7.0")
  api("com.emilsjolander.components.StickyScrollViewItems:library:0.0.1s")
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module03"))
  implementation(project(":module01:module09"))
  implementation(project(":module01:module12:module3"))
  implementation(project(":module01:module19"))
  implementation(project(":module06:module20:module2"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module186:module5"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module234:module1"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module349:module4"))
  implementation(project(":module07:module350:module09"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module423:module1"))
  implementation(project(":module07:module440:module5"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module17:module1"))
  implementation("com.google.android.gms:play-services-safetynet:17.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
