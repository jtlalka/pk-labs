package net.tlalka.pklab.feature.projectlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import net.tlalka.pklab.R
import net.tlalka.pklab.feature.projectlist.domain.GetProjectsUseCase
import net.tlalka.pklab.feature.projectlist.view.adapter.ProjectsAdapter
import net.tlalka.pklab.feature.projectlist.view.listener.ItemClickListener
import net.tlalka.pklab.repository.model.Project
import kotlinx.android.synthetic.main.project_list_fragment.project_list_recycler as projectListRecycler

class ProjectListFragment : Fragment(), ItemClickListener {

    private val projectsAdapter: ProjectsAdapter = ProjectsAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.project_list_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListRecycler()
        initProjectList()
    }

    private fun initListRecycler() = with(projectListRecycler) {
        layoutManager = LinearLayoutManager(context)
        adapter = projectsAdapter
    }

    private fun initProjectList() {
        val projects: List<Project> = GetProjectsUseCase().findProjects()

        projectsAdapter.submitList(projects)
    }

    override fun onItemClickListener(id: Int) {
        findNavController().navigate(ProjectListFragmentDirections.actionToProjectCardFragment(id))
    }
}
