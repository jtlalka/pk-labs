package net.tlalka.pklab.repository

//TODO: Replace this injector by Dagger @Binds annotation in [RepositoryModule]
object ProjectRepositoryInjector {

    var projectRepository: ProjectRepository = LocalProjectRepository()
}