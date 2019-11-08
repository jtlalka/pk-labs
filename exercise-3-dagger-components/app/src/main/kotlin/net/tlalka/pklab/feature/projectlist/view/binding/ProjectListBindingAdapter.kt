package net.tlalka.pklab.feature.projectlist.view.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import net.tlalka.pklab.R

object ProjectListBindingAdapter {

    @JvmStatic
    @BindingAdapter("custom_projectMemorySize")
    fun TextView.projectSizeInKb(sizeInKb: Int) {
        text = if (sizeInKb > 1000) {
            resources.getString(R.string.project_list_item_size_in_mb, sizeInKb / 1000)
        } else {
            resources.getString(R.string.project_list_item_size_in_kb, sizeInKb)
        }
    }
}