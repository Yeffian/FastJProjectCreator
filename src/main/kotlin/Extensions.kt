package id.thedev.yeff

fun String.getLanguage(): ProjectLang? {
    return when (this.lowercase()) {
        "kotlin" -> ProjectLang.KOTLIN
        "java" -> ProjectLang.JAVA
        "groovy" -> ProjectLang.GROOVY
        else -> ProjectLang.UNKNOWN
    }
}

fun String.sanitize(illegal: ArrayList<String>) {

    if (this == " ") {
        throw IllegalStateException("[ERROR] Cannot have empty string as name.")
    }

    for (keyword in illegal) {
        if (this.contains(keyword, true)) {
            throw IllegalStateException("Illegal characters in project name.")
        }
    }
}