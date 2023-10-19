plugins {
//    id("kotlin-android")
//    id("org.jetbrains.kotlin.android")
//    id("androidx.navigation.safeargs.kotlin")
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.todoxml"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.todoxml"
        minSdk = 21
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

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Default dependencies
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Fragment
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    // Lifecycle + ViewModel & LiveData
    //implementation("androidx.lifecycle:lifecycle-view-model-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("android.arch.lifecycle:common-java8:1.1.1")

    // Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.4")

    // Room
    implementation("androidx.room:room-runtime:2.6.0")
    implementation("androidx.room:room-ktx:2.6.0")

    // Coroutines
    //implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
    //implementation("androidx.hilt:hilt-lifecycle-view-model:1.0.0-alpha03")
    kapt("androidx.hilt:hilt-compiler:1.0.0")

    // DataStore
    implementation("androidx.datastore:datastore-preferences:1.0.0")

}

kapt {
    correctErrorTypes = true
}