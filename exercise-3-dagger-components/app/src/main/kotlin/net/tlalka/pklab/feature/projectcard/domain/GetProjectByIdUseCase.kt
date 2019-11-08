package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.model.Project
import javax.inject.Inject

class GetProjectByIdUseCase @Inject constructor(
    private val projectRepository: ProjectRepository
) {

    fun getProject(id: Int): Project =
        projectRepository.findProjectById(id)
}