package id.thedev.yeff

fun main(args: Array<String>) {
    print("Name of your project >> ")
    val name: String? = readLine()?.sanitize(arrayListOf("/", "#", ":", "%", "<", ">", "+", "=", "{", "}", "NUL", "CON"))

    print("Language you want to use (Java/Kotlin/Gradle) >> ")
    val lang: ProjectLang? = readLine()?.getLanguage()

    if (lang == ProjectLang.UNKNOWN) {
       throw IllegalStateException("[ERROR] Unknown language, please try again.")
    }

    val project: ProjectGenerationData = ProjectGenerationData(name as String, lang as ProjectLang)

    generateProj(project)
}