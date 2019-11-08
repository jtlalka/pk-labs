package net.tlalka.pklab.feature.di

import dagger.Subcomponent
import net.tlalka.pklab.feature.projectlist.ProjectListFragment

@FeatureScope
@Subcomponent(modules = [FeatureModule::class])
interface FeatureComponent {

    fun inject(projectListFragment: ProjectListFragment)

    //TODO: Add inject method for [ProjectCardFragment] like it is done above for [ProjectListFragment]

    @Subcomponent.Builder
    interface Builder {

        fun build(): FeatureComponent
    }
}