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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module05:module01:module1"))
  api(project(":module06:module19:module2:module1"))
  api(project(":module07:module025:module3"))
  api(project(":module07:module066:module1"))
  api(project(":module07:module077:module3"))
  api(project(":module07:module080:module1"))
  api(project(":module07:module118:module2"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module147:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module183:module09"))
  api(project(":module07:module189:module3"))
  api(project(":module07:module195:module02:module5:module2"))
  api(project(":module07:module195:module10:module2:module2"))
  api(project(":module07:module196:module2"))
  api(project(":module07:module208:module3"))
  api(project(":module07:module214:module2"))
  api(project(":module07:module213:module1"))
  api(project(":module07:module224:module3"))
  api(project(":module07:module243:module4"))
  api(project(":module07:module240:module2"))
  api(project(":module07:module283:module4"))
  api(project(":module07:module292:module2"))
  api(project(":module07:module294:module3"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module368:module4"))
  api(project(":module07:module390:module3"))
  api(project(":module07:module406:module3"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module424:module1"))
  api(project(":module07:module467:module2"))
  api(project(":module07:module489:module3"))
  api(project(":module07:module502:module1"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module526:module2:module2"))
  api(project(":module08:module06:module1"))
  api(project(":module08:module12:module09:module3"))
  api(project(":module08:module25:module2:module1"))
  api(project(":module08:module25:module4:module1"))
  api(project(":module08:module25:module3:module2"))
  api(project(":module08:module38:module08:module5"))
  api(project(":module08:module55:module1"))
  api(project(":module08:module61:module4"))
  api(project(":module19:module1:module01:module2"))
  api(project(":module19:module1:module03:module1"))
  api(project(":module19:module1:module05:module2"))
  api(project(":module19:module1:module09:module2"))
  api(project(":module19:module1:module10:module2"))
  api(project(":module19:module1:module11:module5"))
  api(project(":module19:module1:module15:module2"))
  api(project(":module19:module1:module16:module2"))
  api(project(":module19:module1:module19:module2"))
  api(project(":module19:module1:module20:module1"))
  api(project(":module19:module1:module22:module2"))
  api(project(":module19:module1:module21:module2"))
  api(project(":module19:module1:module26:module3"))
  api(project(":module19:module2:module03:module1"))
  api(project(":module19:module2:module05:module1"))
  api(project(":module19:module2:module07:module2"))
  api(project(":module19:module2:module10:module4"))
  api(project(":module19:module2:module15:module1"))
  api(project(":module19:module2:module21:module1"))
  api(project(":module19:module2:module27:module1"))
  api(project(":module19:module2:module29:module1"))
  api(project(":module19:module2:module35:module1"))
  api(project(":module19:module2:module34:module7"))
  api(project(":module19:module2:module34:module8"))
  api(project(":module19:module2:module40:module3"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
