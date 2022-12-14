plugins {
  id("java-library")
  id("java")
  id("org.jetbrains.kotlin.jvm")
}
dependencies {
  api("io.netty:netty-codec-http:4.1.59.Final")
  api("io.netty:netty-transport-native-epoll:4.1.59.Final")
  api("io.netty:netty-transport-native-kqueue:4.1.59.Final")
  api("io.netty:netty-transport:4.1.59.Final")
  api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
  api("org.slf4j:slf4j-simple:1.7.32")
  api("software.amazon.awssdk:s3:2.15.70")
  api("software.amazon.awssdk:sts:2.15.70")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.msgpack:msgpack-core:0.8.22")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
}
