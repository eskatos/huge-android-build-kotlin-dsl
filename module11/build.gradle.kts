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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module06:module02:module1"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module339:module3"))
  api(project(":module07:module539:module1"))
  api("androidx.test.espresso:espresso-core:3.3.0")
  api("androidx.test.espresso:espresso-idling-resource:3.3.0")
  api("androidx.test.uiautomator:uiautomator:2.2.0")
  api("com.google.dagger:dagger:2.39.1")
  api("com.google.truth:truth:1.1.3")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("junit:junit:4.13.2")
  api("org.hamcrest:hamcrest-core:1.3")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module12:module3"))
  implementation(project(":module05:module14:module10"))
  implementation(project(":module06:module04:module1"))
  implementation(project(":module06:module05:module01:module1"))
  implementation(project(":module06:module05:module02:module1"))
  implementation(project(":module06:module05:module03:module2"))
  implementation(project(":module06:module05:module21:module1"))
  implementation(project(":module06:module05:module21:module2"))
  implementation(project(":module06:module05:module21:module3"))
  implementation(project(":module06:module05:module23:module2"))
  implementation(project(":module06:module05:module26:module2"))
  implementation(project(":module06:module10:module1"))
  implementation(project(":module06:module16:module09"))
  implementation(project(":module06:module19:module2:module2"))
  implementation(project(":module07:module001:module2"))
  implementation(project(":module07:module014:module3"))
  implementation(project(":module07:module017:module2"))
  implementation(project(":module07:module022:module1:module2"))
  implementation(project(":module07:module022:module3:module2"))
  implementation(project(":module07:module022:module4:module2"))
  implementation(project(":module07:module022:module8:module3"))
  implementation(project(":module07:module023:module1:module1"))
  implementation(project(":module07:module024:module5"))
  implementation(project(":module07:module032:module5"))
  implementation(project(":module07:module050:module4"))
  implementation(project(":module07:module052:module4"))
  implementation(project(":module07:module053:module3"))
  implementation(project(":module07:module060:module2"))
  implementation(project(":module07:module060:module3"))
  implementation(project(":module07:module057:module4"))
  implementation(project(":module07:module057:module6"))
  implementation(project(":module07:module066:module3"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module082:module2"))
  implementation(project(":module07:module086:module6"))
  implementation(project(":module07:module092:module5"))
  implementation(project(":module07:module096:module3"))
  implementation(project(":module07:module094:module1"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module148:module08"))
  implementation(project(":module07:module151:module1"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module166:module1"))
  implementation(project(":module07:module171:module5"))
  implementation(project(":module07:module182"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module195:module02:module5:module5"))
  implementation(project(":module07:module195:module02:module7:module5"))
  implementation(project(":module07:module206"))
  implementation(project(":module07:module211:module4"))
  implementation(project(":module07:module212:module4"))
  implementation(project(":module07:module231:module1"))
  implementation(project(":module07:module253:module1"))
  implementation(project(":module07:module254:module1"))
  implementation(project(":module07:module267:module4"))
  implementation(project(":module07:module271:module1"))
  implementation(project(":module07:module272:module1"))
  implementation(project(":module07:module281:module1"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module293:module4"))
  implementation(project(":module07:module307:module4"))
  implementation(project(":module07:module308:module2"))
  implementation(project(":module07:module302:module1"))
  implementation(project(":module07:module310:module2"))
  implementation(project(":module07:module321:module5"))
  implementation(project(":module07:module327:module3"))
  implementation(project(":module07:module333:module3"))
  implementation(project(":module07:module333:module4"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module349:module1"))
  implementation(project(":module07:module346:module1"))
  implementation(project(":module07:module355:module2"))
  implementation(project(":module07:module357:module2"))
  implementation(project(":module07:module372:module4"))
  implementation(project(":module07:module379:module1"))
  implementation(project(":module07:module385:module1"))
  implementation(project(":module07:module404:module1:module2"))
  implementation(project(":module07:module423:module1"))
  implementation(project(":module07:module428:module2"))
  implementation(project(":module07:module435:module1"))
  implementation(project(":module07:module436:module4"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module476:module3"))
  implementation(project(":module07:module496"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module512:module7"))
  implementation(project(":module07:module526:module1:module3"))
  implementation(project(":module07:module526:module3:module3"))
  implementation(project(":module07:module533:module2"))
  implementation(project(":module07:module536:module1"))
  implementation(project(":module07:module536:module3"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module558"))
  implementation(project(":module09:module2"))
  implementation(project(":module09:module3"))
  implementation(project(":module08:module03:module1"))
  implementation(project(":module08:module09:module3"))
  implementation(project(":module08:module11:module01:module1:module4"))
  implementation(project(":module08:module11:module01:module4:module2"))
  implementation(project(":module08:module11:module01:module5:module3"))
  implementation(project(":module08:module11:module01:module6:module3"))
  implementation(project(":module08:module11:module02:module3"))
  implementation(project(":module08:module11:module09:module2"))
  implementation(project(":module08:module11:module10:module3"))
  implementation(project(":module08:module11:module11:module4"))
  implementation(project(":module08:module11:module13:module3"))
  implementation(project(":module08:module11:module16:module3"))
  implementation(project(":module08:module11:module15:module2:module2"))
  implementation(project(":module08:module11:module15:module2:module3"))
  implementation(project(":module08:module11:module15:module3:module2"))
  implementation(project(":module08:module11:module15:module3:module3"))
  implementation(project(":module08:module11:module15:module4:module2"))
  implementation(project(":module08:module11:module17:module3"))
  implementation(project(":module08:module11:module18:module1:module3"))
  implementation(project(":module08:module11:module18:module2:module3"))
  implementation(project(":module08:module11:module20:module2"))
  implementation(project(":module08:module13:module1"))
  implementation(project(":module08:module14:module3"))
  implementation(project(":module08:module17"))
  implementation(project(":module08:module20:module3"))
  implementation(project(":module08:module24"))
  implementation(project(":module08:module26"))
  implementation(project(":module08:module27:module2"))
  implementation(project(":module08:module28:module2"))
  implementation(project(":module08:module28:module3"))
  implementation(project(":module08:module28:module5"))
  implementation(project(":module08:module30"))
  implementation(project(":module08:module32"))
  implementation(project(":module08:module34:module2"))
  implementation(project(":module08:module39:module2"))
  implementation(project(":module08:module42:module6"))
  implementation(project(":module08:module43"))
  implementation(project(":module08:module45"))
  implementation(project(":module08:module44:module5"))
  implementation(project(":module08:module47:module1"))
  implementation(project(":module08:module48:module1"))
  implementation(project(":module08:module49:module1"))
  implementation(project(":module08:module50:module1"))
  implementation(project(":module08:module58"))
  implementation(project(":module08:module59"))
  implementation(project(":module08:module60:module2"))
  implementation(project(":module08:module61:module5"))
  implementation(project(":module10:module1"))
  implementation(project(":module10:module4"))
  implementation(project(":module16:module061:module1"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.google.truth:truth:1.1.3")
  implementation("junit:junit:4.13.2")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
