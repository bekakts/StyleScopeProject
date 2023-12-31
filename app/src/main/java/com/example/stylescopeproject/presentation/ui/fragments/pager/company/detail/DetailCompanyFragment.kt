package com.example.stylescopeproject.presentation.ui.fragments.pager.company.detail

import android.util.Log
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentDetailCompanyBinding
import com.example.stylescopeproject.presentation.ui.adapters.company.company_package.CompanyPackageAdapter
import com.example.stylescopeproject.presentation.ui.adapters.company.company_team.CompanyTeamAdapter
import com.example.stylescopeproject.presentation.ui.adapters.company.company_works.CompanyWorksAdapter
import com.example.stylescopeproject.presentation.utils.loadImage
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailCompanyFragment :
    BaseFragment<FragmentDetailCompanyBinding, DetailCompanyVIewModel>(R.layout.fragment_detail_company) {
    override val binding: FragmentDetailCompanyBinding by viewBinding(FragmentDetailCompanyBinding::bind)
    override val viewModel: DetailCompanyVIewModel by viewModel()
    private val args by navArgs<DetailCompanyFragmentArgs>()
    private val packageAdapter by lazy { CompanyPackageAdapter() }
    private val teamAdapter by lazy { CompanyTeamAdapter() }
    private val companyWorksAdapter by lazy { CompanyWorksAdapter() }


    override fun launchObservers() {
        viewModel.getDetailCompanies(args.companyID)

        binding.rvPrices.adapter = packageAdapter
        binding.rvTeam.adapter = teamAdapter
        binding.companyWorksPager.adapter = companyWorksAdapter

        viewModel.state.spectateUiState(success = { company ->
            binding.imgDetailCompany.loadImage(company.image)
            binding.tvDetailCompanyDes.text = company.about
            binding.tvWhatsappContact.text = company.phoneNumber1
            val instagram = company.socialMedia1.replace("https://www.instagram.com/", "")
            val insta = instagram.replace("/", "")
            binding.tvInstagramContact.text = insta
            binding.tvGmailContact.text = company.email1
            binding.tvCompanyAddress.text = company.address
            packageAdapter.submitList(company.services)
            teamAdapter.submitList(company.designers)
            companyWorksAdapter.submitList(company.gallery)
        }, error = { errorMsg ->
            Toast.makeText(requireContext(), "Error $errorMsg", Toast.LENGTH_LONG).show()
            binding.tvDetailCompanyDes.text = errorMsg
            Log.e("ololo", errorMsg)
        })
    }
}