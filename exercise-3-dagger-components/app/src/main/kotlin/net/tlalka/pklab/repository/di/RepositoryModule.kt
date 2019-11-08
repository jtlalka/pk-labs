package net.tlalka.pklab.repository.di

import dagger.Binds
import dagger.Module
import net.tlalka.pklab.repository.LocalProjectRepository
import net.tlalka.pklab.repository.ProjectRepository
import net.tlalka.pklab.repository.data.LocalProjectData
import net.tlalka.pklab.repository.data.ProjectData

@Module
internal interface RepositoryModule {

    @Binds
    fun bindProjectData(impl: LocalProjectData): ProjectData

    @Binds
    fun bindProjectRepository(impl: LocalProjectRepository): ProjectRepository
}