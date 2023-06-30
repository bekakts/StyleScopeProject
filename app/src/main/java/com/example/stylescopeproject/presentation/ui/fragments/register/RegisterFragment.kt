package com.example.stylescopeproject.presentation.ui.fragments.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentRegisterBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RegisterFragment :
    BaseFragment<FragmentRegisterBinding, RegisterViewModel>(R.layout.fragment_register) {
    override val binding: FragmentRegisterBinding by viewBinding(FragmentRegisterBinding::bind)
    override val viewModel: RegisterViewModel by viewModel()

    override fun constructListeners() {
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.confirmCodeFragment)
        }

        binding.tvSignIn.setOnClickListener {
            findNavController().navigate(R.id.interFragment)
        }

        binding.btnGo.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
    }
}