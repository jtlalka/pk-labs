package net.tlalka.pklab.feature.projectcard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import net.tlalka.pklab.R
import net.tlalka.pklab.feature.projectcard.domain.GetProjectByIdUseCase
import net.tlalka.pklab.feature.projectcard.domain.RateProjectUseCase
import net.tlalka.pklab.network.NetworkHeavyApi
import net.tlalka.pklab.repository.LocalProjectRepository
import kotlinx.android.synthetic.main.project_card_fragment.project_card_project_licence as projectLicence
import kotlinx.android.synthetic.main.project_card_fragment.project_card_project_name as projectName
import kotlinx.android.synthetic.main.project_card_fragment.project_card_project_rate as rateButton

class ProjectCardFragment : Fragment() {

    private val args: ProjectCardFragmentArgs by navArgs()

    /**
     * TODO: Remove [LocalProjectRepository] from constructor when it will be possible.
     */
    private val projectUseCase: GetProjectByIdUseCase by lazy {
        GetProjectByIdUseCase(LocalProjectRepository())
    }

    /**
     * TODO: Remove [NetworkHeavyApi] from constructor when it will be possible.
     */
    private val rateProjectUseCase: RateProjectUseCase by lazy {
        RateProjectUseCase(NetworkHeavyApi())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.project_card_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        projectUseCase.getProject(args.id).let {
            projectName.text = it.name
            projectLicence.text = it.licence
        }

        rateButton.setOnClickListener {
            rateProjectUseCase.rateProject(args.id)
        }
    }
}
