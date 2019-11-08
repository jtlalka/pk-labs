package net.tlalka.pklab.feature.projectlist.domain

import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.model.Project
import javax.inject.Inject

class GetProjectsUseCase @Inject constructor(
    private val projectRepository: ProjectRepository
) {

    fun findProjects(): List<Project> =
        projectRepository.getAllProjects()
}