package net.tlalka.pklab.repository

import net.tlalka.pklab.repository.model.Project

interface ProjectRepository {

    fun findProjectById(id: Int): Project

    fun getAllProjects(): List<Project>
}