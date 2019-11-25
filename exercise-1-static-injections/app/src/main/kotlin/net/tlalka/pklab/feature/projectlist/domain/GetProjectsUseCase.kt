package net.tlalka.pklab.feature.projectlist.domain

import net.tlalka.pklab.repository.LocalProjectRepository
import net.tlalka.pklab.repository.model.Project

class GetProjectsUseCase {

    // TODO: Use DI via constructor and operate on [ProjectRepository] interface.
    fun findProjects(): List<Project> {
        return LocalProjectRepository().getAllProjects()
    }
}