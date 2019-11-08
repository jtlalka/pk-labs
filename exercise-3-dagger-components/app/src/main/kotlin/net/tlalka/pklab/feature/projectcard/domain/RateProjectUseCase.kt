package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.network.NetworkHeavyApi
import javax.inject.Inject

class RateProjectUseCase @Inject constructor(
    private val networkApi: NetworkHeavyApi
) {

    fun rateProject(id: Int) =
        networkApi.rateProject(id)
}