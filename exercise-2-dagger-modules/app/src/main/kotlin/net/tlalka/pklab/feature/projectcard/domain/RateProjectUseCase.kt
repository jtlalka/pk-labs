package net.tlalka.pklab.feature.projectcard.domain

import net.tlalka.pklab.network.NetworkHeavyApi
import net.tlalka.pklab.network.NetworkHeavyApiInjector

//TODO: Use Dagger @Inject annotation to inject [NetworkHeavyApi] via constructor.
class RateProjectUseCase(
    private val networkApi: NetworkHeavyApi = NetworkHeavyApiInjector.network
) {

    fun rateProject(id: Int) =
        networkApi.rateProject(id)
}