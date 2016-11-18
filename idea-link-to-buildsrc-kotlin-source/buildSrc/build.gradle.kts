buildscript {
    configure(listOf(repositories, project.repositories)) {
        gradleScriptKotlin()
    }

    extra["kotlin_version"] = "1.0.5-eap-117"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin_version"]}")
    }
}

apply {
    plugin("kotlin")
}

dependencies {
    compile(gradleApi())
    compile("org.jetbrains.kotlin:kotlin-stdlib:${extra["kotlin_version"]}")
}
