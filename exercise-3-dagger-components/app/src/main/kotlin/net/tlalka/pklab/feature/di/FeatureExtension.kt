package net.tlalka.pklab.feature.di

import androidx.fragment.app.Fragment
import net.tlalka.pklab.app.di.applicationComponent

val Fragment.featureComponent: FeatureComponent
    get() = requireActivity().applicationComponent
        .featureComponent()
        .build()
