package com.example.stylescopeproject.presentation.ui.fragments.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentMainBinding
import com.example.stylescopeproject.presentation.model.company.CompanyUI
import com.example.stylescopeproject.presentation.ui.adapters.company.CompanyAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(R.layout.fragment_main) {
    override val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)
    override val viewModel: MainViewModel by viewModel()
    private val adapter: CompanyAdapter by lazy { CompanyAdapter() }
    private val list = mutableListOf<CompanyUI>()


    override fun launchObservers() {
        binding.viewPagerCompany.adapter = adapter
        viewModel.companyState.spectateUiState (success = { companies ->
            adapter.submitList(companies)
            list.addAll(companies)
        })


        viewModel.designerState.spectateUiState (success = { designers ->

        })
    }

    override fun constructListeners() {
        binding.tvWatchAllCompanies.setOnClickListener {
            findNavController().navigate(R.id.companiesFragment)
        }
    }

}