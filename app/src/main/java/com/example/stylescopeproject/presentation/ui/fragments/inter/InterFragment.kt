package com.example.stylescopeproject.presentation.ui.fragments.inter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentInterBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class InterFragment : BaseFragment<FragmentInterBinding, InterViewModel>(R.layout.fragment_inter) {
    override val binding: FragmentInterBinding by viewBinding(FragmentInterBinding::bind)
    override val viewModel: InterViewModel by viewModel()

    override fun constructListeners() {
        binding.btnInter.setOnClickListener {
            findNavController().navigate(R.id.successFragment)
        }

        binding.btnGo.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }

        binding.tvRegister.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }
    }
}