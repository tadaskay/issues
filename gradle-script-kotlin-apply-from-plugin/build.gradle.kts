buildscript {
    repositories {
        jcenter()
        gradleScriptKotlin()
    }
    dependencies {
        classpath("org.gradle:gradle-hello-world-plugin:0.2")
    }
}

applyFrom("applied.gradle.kts")
