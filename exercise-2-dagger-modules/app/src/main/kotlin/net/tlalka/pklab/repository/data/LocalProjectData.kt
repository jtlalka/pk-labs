package net.tlalka.pklab.repository.data

import net.tlalka.pklab.repository.model.Project

//TODO: Add empty constructor with @Inject annotation or provide this object like [NetworkHeavyApi]
internal class LocalProjectData : ProjectData {

    override val projects: List<Project> = listOf(
        Project(
            id = 0,
            name = "Dagger 2",
            licence = "Apache-2.0",
            size = 32
        ),
        Project(
            id = 1,
            name = "Koin",
            licence = "Apache-2.0",
            size = 13
        ),
        Project(
            id = 2,
            name = "Kodein",
            licence = "Apache-2.0",
            size = 24
        ),
        Project(
            id = 3,
            name = "Coil",
            licence = "Apache-2.0",
            size = 24
        ),
        Project(
            id = 4,
            name = "Retrofit",
            licence = "Apache-2.0",
            size = 124
        ),
        Project(
            id = 5,
            name = "Ktor",
            licence = "Apache-2.0",
            size = 668
        ),
        Project(
            id = 6,
            name = "Glide",
            licence = "Apache-2.0",
            size = 605
        ),
        Project(
            id = 7,
            name = "RxJava2",
            licence = "Apache-2.0",
            size = 2200
        )
    )
}
