package com.zhaofan.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def extension = project.extensions.create('testCodePlugin',TestExtension)
        project.afterEvaluate {
            println("$extension.name")
        }
        def testTransform = new TestTransform()
        def testBaseExtension = project.extensions.getByType(BaseExtension)
        testBaseExtension.registerTransform(testTransform)
    }
}
