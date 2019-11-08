package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.network.NetworkHeavyApi

/**
 * TODO: Add default parameter value to constructor. [NetworkHeavyApiInjector.network]
 */
class RateProjectUseCase(
    private val networkApi: NetworkHeavyApi
) {

    fun rateProject(id: Int) =
        networkApi.rateProject(id)
}