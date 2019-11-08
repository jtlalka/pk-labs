package net.tlalka.pklab.network.di

import net.tlalka.pklab.app.di.ApplicationScope
import dagger.Module
import dagger.Provides
import net.tlalka.pklab.network.NetworkHeavyApi

@Module
object NetworkModule {

    @JvmStatic
    @Provides
    @ApplicationScope
    fun provideNetworkHeavyApi(): NetworkHeavyApi = NetworkHeavyApi()
}