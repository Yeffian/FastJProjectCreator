package id.thedev.yeff

data class ProjectGenerationData(val name: String, val type: ProjectLang) {
    override fun toString(): String {
        return "Data($name, $type)"
    }
}