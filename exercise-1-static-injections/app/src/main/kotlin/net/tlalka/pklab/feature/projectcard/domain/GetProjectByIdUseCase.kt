package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.model.Project

/**
 * TODO: Add default parameter value to constructor, use [ProjectRepositoryInjector]
 */
class GetProjectByIdUseCase(
    private val projectRepository: ProjectRepository
) {

    fun getProject(id: Int): Project =
        projectRepository.findProjectById(id)
}