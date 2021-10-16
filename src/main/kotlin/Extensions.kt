package id.thedev.yeff

fun String.getLanguage(): ProjectLang? {
    return when (this.lowercase()) {
        "kotlin" -> ProjectLang.KOTLIN
        "java" -> ProjectLang.JAVA
        "groovy" -> ProjectLang.GROOVY
        else -> ProjectLang.UNKNOWN
    }
}

fun String.sanitize() {
    if (this == "") {
        throw IllegalStateException("[ERROR] Cannot have empty string as name.")
    }
}