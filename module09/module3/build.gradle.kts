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
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module01"))
  api(project(":module05:module01:module1"))
  api(project(":module05:module06:module1"))
  api(project(":module05:module12:module1"))
  api(project(":module05:module14:module10"))
  api(project(":module05:module25:module6"))
  api(project(":module05:module26:module1"))
  api(project(":module05:module34:module1"))
  api(project(":module07:module005:module1"))
  api(project(":module07:module016:module1"))
  api(project(":module07:module034"))
  api(project(":module07:module052:module6"))
  api(project(":module07:module056:module1"))
  api(project(":module07:module065:module6"))
  api(project(":module07:module072:module1"))
  api(project(":module07:module074:module1"))
  api(project(":module07:module074:module2"))
  api(project(":module07:module074:module3"))
  api(project(":module07:module090:module5"))
  api(project(":module07:module099"))
  api(project(":module07:module132:module1"))
  api(project(":module07:module147:module8"))
  api(project(":module07:module180:module1"))
  api(project(":module07:module194"))
  api(project(":module07:module195:module09:module2"))
  api(project(":module07:module216:module1"))
  api(project(":module07:module222:module1"))
  api(project(":module07:module224:module4"))
  api(project(":module07:module229:module4:module1"))
  api(project(":module07:module249"))
  api(project(":module07:module251"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module290:module3"))
  api(project(":module07:module297:module1"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module319:module1"))
  api(project(":module07:module332:module1"))
  api(project(":module07:module400:module3"))
  api(project(":module07:module404:module1:module2"))
  api(project(":module07:module443:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module467:module1"))
  api(project(":module07:module464:module2"))
  api(project(":module07:module468:module1"))
  api(project(":module07:module488:module4"))
  api(project(":module07:module503:module1"))
  api(project(":module07:module509:module1"))
  api(project(":module07:module522:module1"))
  api(project(":module07:module527"))
  api(project(":module07:module549:module3"))
  api(project(":module07:module557"))
  api(project(":module09:module2"))
  api(project(":module08:module17"))
  api(project(":module08:module33:module3"))
  api(project(":module08:module46:module2"))
  api("androidx.test.espresso:espresso-core:3.3.0")
  api("androidx.test.espresso:espresso-idling-resource:3.3.0")
  api("androidx.test:runner:1.4.0")
  api("com.bugsnag:bugsnag-android:5.0.0")
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module079:module1"))
  implementation(project(":module07:module186:module3"))
  implementation(project(":module07:module264:module6"))
  implementation(project(":module07:module447:module2"))
  implementation(project(":module07:module518:module02"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module541:module1"))
  implementation(project(":module08:module13:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
