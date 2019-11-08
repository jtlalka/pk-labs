package net.tlalka.pklab.repository

import net.tlalka.pklab.repository.data.ProjectData
import net.tlalka.pklab.repository.data.ProjectDataInjector
import net.tlalka.pklab.repository.model.Project

internal class LocalProjectRepository(
    private val projectData: ProjectData = ProjectDataInjector.projectData
) : ProjectRepository {

    override fun findProjectById(id: Int): Project =
        projectData.projects
            .first { it.id == id }

    override fun getAllProjects(): List<Project> =
        projectData.projects
}