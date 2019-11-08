package net.tlalka.pklab.feature.projectlist.domain

import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.ProjectRepositoryInjector
import net.tlalka.pklab.repository.model.Project

class GetProjectsUseCase(
    private val projectRepository: ProjectRepository = ProjectRepositoryInjector.projectRepository
) {

    fun findProjects(): List<Project> {
        return projectRepository.getAllProjects()
    }
}