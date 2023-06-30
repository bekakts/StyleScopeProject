package com.example.stylescopeproject.presentation.ui.fragments.success

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentSuccessBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SuccessFragment : BaseFragment<FragmentSuccessBinding, SuccessViewModel>(R.layout.fragment_success) {
    override val binding: FragmentSuccessBinding by viewBinding(FragmentSuccessBinding::bind)
    override val viewModel: SuccessViewModel by viewModel()

}