package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.ProjectRepositoryInjector
import net.tlalka.pklab.repository.model.Project

//TODO: Use Dagger @Inject annotation to inject [ProjectRepository] via constructor.
class GetProjectByIdUseCase(
    private val projectRepository: ProjectRepository = ProjectRepositoryInjector.projectRepository
) {

    fun getProject(id: Int): Project =
        projectRepository.findProjectById(id)
}