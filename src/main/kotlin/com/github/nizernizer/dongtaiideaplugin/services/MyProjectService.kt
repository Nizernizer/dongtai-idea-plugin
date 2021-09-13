package com.github.nizernizer.dongtaiideaplugin.services

import com.intellij.openapi.project.Project
import com.github.nizernizer.dongtaiideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
