package net.tlalka.pklab.network

//TODO: Remove this injector when Dagger will be fully responsible for injecting [NetworkHeavyApi]
object NetworkHeavyApiInjector {

    val network: NetworkHeavyApi by lazy {
        NetworkHeavyApi()
    }
}