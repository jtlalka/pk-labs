package net.tlalka.pklab.repository

import net.tlalka.pklab.repository.data.ProjectData
import net.tlalka.pklab.repository.model.Project
import javax.inject.Inject

internal class LocalProjectRepository @Inject constructor(
    private val projectData: ProjectData
) : ProjectRepository {

    override fun findProjectById(id: Int): Project =
        projectData.projects
            .first { it.id == id }

    override fun getAllProjects(): List<Project> =
        projectData.projects
}