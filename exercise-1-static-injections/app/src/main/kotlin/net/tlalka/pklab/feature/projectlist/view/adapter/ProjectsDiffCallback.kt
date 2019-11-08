package net.tlalka.pklab.feature.projectlist.view.adapter

import androidx.recyclerview.widget.DiffUtil
import net.tlalka.pklab.repository.model.Project

class ProjectsDiffCallback : DiffUtil.ItemCallback<Project>() {

    override fun areItemsTheSame(oldItem: Project, newItem: Project): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Project, newItem: Project): Boolean {
        return oldItem == newItem
    }
}
