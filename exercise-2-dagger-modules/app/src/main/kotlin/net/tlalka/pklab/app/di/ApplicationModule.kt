package net.tlalka.pklab.app.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
@Suppress("unused")
internal abstract class ApplicationModule {

    @Binds
    @ApplicationScope
    abstract fun bindsContext(application: Application): Context
}