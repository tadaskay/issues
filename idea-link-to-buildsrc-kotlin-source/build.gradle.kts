buildscript {
    repositories {
        gradleScriptKotlin()
    }
}

task("helloWorld") {
    println(myConst)
}
