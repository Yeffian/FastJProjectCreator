package id.thedev.yeff

import com.lordcodes.turtle.shellRun

fun generateProj(data: ProjectGenerationData) {
    shellRun {
        git.clone("https://github.com/lucasstarsz/fastj-${data.type.toString().lowercase()}-template", data.name)
    }
}