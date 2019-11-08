package net.tlalka.pklab.app.di

import android.app.Activity
import androidx.fragment.app.Fragment

val Activity.applicationComponent: ApplicationComponent
    get() = (application as ApplicationComponentHolder).applicationComponent

val Fragment.applicationComponent: ApplicationComponent
    get() = requireActivity().applicationComponent
