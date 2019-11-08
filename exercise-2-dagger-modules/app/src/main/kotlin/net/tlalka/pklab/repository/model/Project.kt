package net.tlalka.pklab.repository.model

data class Project(
    val id: Int,
    val name: String = "",
    val licence: String = "",
    val size: Int = 0
)