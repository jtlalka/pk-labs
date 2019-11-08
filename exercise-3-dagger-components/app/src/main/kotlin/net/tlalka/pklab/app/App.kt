package net.tlalka.pklab.app

import android.app.Application
import net.tlalka.pklab.app.di.ApplicationComponent
import net.tlalka.pklab.app.di.ApplicationComponentHolder
import net.tlalka.pklab.app.di.DaggerApplicationComponent

import kotlin.LazyThreadSafetyMode.NONE

class App : Application(),
    ApplicationComponentHolder {

    override val applicationComponent: ApplicationComponent by lazy(NONE) {
        DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
    }
}