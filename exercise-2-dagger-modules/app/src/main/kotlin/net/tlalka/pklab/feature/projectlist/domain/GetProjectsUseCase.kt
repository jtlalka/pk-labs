package net.tlalka.pklab.feature.projectlist.domain

import net.tlalka.pklab.repository.ProjectRepositoryInjector
import net.tlalka.pklab.repository.model.Project
import javax.inject.Inject

class GetProjectsUseCase @Inject constructor() {

    //TODO: Inject [ProjectRepository] using Dagger constructor injection with @Inject annotation.
    fun findProjects(): List<Project> =
        ProjectRepositoryInjector.projectRepository.getAllProjects()
}