plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")
    kotlin("kapt")
}

android {
    namespace = "com.example.weather"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weather"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding = true
    }
}
var lifecycle_version = "2.6.1"
var coroutines_version = "1.7.3"
var lifeData_version = "2.8.3"
val activity_version = "1.9.1"
var glideVersion = "4.15.1"
var gsonVersion = "2.11.0"
var retrofitVersion = "2.9.0"

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    // Kotlin
    implementation("androidx.activity:activity-ktx:$activity_version")
    //GLIDE
    implementation("com.github.bumptech.glide:glide:$glideVersion")
    ksp("com.github.bumptech.glide:ksp:$glideVersion")
    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    //COROUTINES
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")
    //LIVEDATA
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifeData_version")
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
}