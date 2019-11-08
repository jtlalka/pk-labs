package net.tlalka.pklab.repository.data

//TODO: Replace this injector by adding Dagger @Binds annotation in [RepositoryModule]
object ProjectDataInjector {

    var projectData: ProjectData = LocalProjectData()
}