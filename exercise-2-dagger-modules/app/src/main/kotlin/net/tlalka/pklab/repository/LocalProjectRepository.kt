package net.tlalka.pklab.repository

import net.tlalka.pklab.repository.data.LocalProjectData
import net.tlalka.pklab.repository.model.Project

/**
 * TODO: Create injector [ProjectRepositoryInjector] to return always the same instance of [ProjectRepository] interface.
 */
internal class LocalProjectRepository : ProjectRepository {

    /**
     * TODO: Inject via class constructor [LocalProjectData] class, operate on [ProjectData] interface.
     */
    override fun findProjectById(id: Int): Project =
        LocalProjectData().projects
            .first { it.id == id }

    override fun getAllProjects(): List<Project> =
        LocalProjectData().projects
}