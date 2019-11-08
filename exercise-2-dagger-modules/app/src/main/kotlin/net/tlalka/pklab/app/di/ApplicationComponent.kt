package net.tlalka.pklab.app.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import net.tlalka.pklab.feature.di.FeatureComponent
import net.tlalka.pklab.network.di.NetworkModule
import net.tlalka.pklab.repository.di.RepositoryModule

@ApplicationScope
@Component(
    modules = [
        ApplicationModule::class,
        NetworkModule::class,
        RepositoryModule::class
    ]
)
interface ApplicationComponent {

    fun application(): Application

    fun featureComponent(): FeatureComponent.Builder

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(context: Application): Builder

        fun build(): ApplicationComponent
    }
}