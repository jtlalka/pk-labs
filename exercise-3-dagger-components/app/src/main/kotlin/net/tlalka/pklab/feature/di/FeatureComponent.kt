package net.tlalka.pklab.feature.di

import dagger.Subcomponent
import net.tlalka.pklab.feature.projectcard.ProjectCardFragment
import net.tlalka.pklab.feature.projectlist.ProjectListFragment

@FeatureScope
@Subcomponent(modules = [FeatureModule::class])
interface FeatureComponent {

    fun inject(projectListFragment: ProjectListFragment)

    fun inject(projectCardFragment: ProjectCardFragment)

    @Subcomponent.Builder
    interface Builder {

        fun build(): FeatureComponent
    }
}