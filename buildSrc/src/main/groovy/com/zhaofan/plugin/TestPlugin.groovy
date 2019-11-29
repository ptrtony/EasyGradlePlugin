package com.zhaofan.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class TestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def extension = project.extensions.create('testCodePlugin',TestExtension)
        target.afterEvaluate {
            println("$extension.name")
        }
    }
}
