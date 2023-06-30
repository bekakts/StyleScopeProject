package com.example.stylescopeproject.presentation.ui.fragments.confirm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentConfirmCodeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ConfirmCodeFragment :
    BaseFragment<FragmentConfirmCodeBinding, ConfirmCodeViewModel>(R.layout.fragment_confirm_code) {
    override val binding: FragmentConfirmCodeBinding by viewBinding(FragmentConfirmCodeBinding::bind)
    override val viewModel: ConfirmCodeViewModel by viewModel()


    override fun constructListeners() {
        binding.btnConfirm.setOnClickListener {
            findNavController().navigate(R.id.successFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}