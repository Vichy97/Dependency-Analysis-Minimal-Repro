plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.vincent.module_a"
  compileSdk = 34

  defaultConfig {
    minSdk = 24

    testInstrumentationRunner = "com.vincent.module_b.CustomTestInstrumentationRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation(project(":module_b"))
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test:monitor:1.6.1")
  androidTestImplementation("junit:junit:4.13.2")
}