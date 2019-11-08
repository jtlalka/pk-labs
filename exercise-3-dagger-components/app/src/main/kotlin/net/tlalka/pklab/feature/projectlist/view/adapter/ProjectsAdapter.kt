package net.tlalka.pklab.feature.projectlist.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import net.tlalka.pklab.databinding.ProjectListItemBinding
import net.tlalka.pklab.databinding.ProjectListItemBinding.inflate
import net.tlalka.pklab.feature.projectlist.view.listener.ItemClickListener
import net.tlalka.pklab.repository.model.Project

class ProjectsAdapter(
    private val clickListener: ItemClickListener
) : ListAdapter<Project, ProjectsAdapter.ViewHolder>(ProjectsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(getItem(position), clickListener)

    class ViewHolder(
        private val binding: ProjectListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(project: Project, clickListener: ItemClickListener) {
            binding.item = project
            binding.clickListener = clickListener
        }
    }
}