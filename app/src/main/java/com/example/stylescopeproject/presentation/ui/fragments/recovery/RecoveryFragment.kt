package com.example.stylescopeproject.presentation.ui.fragments.recovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragment
import com.example.stylescopeproject.databinding.FragmentRecoveryBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecoveryFragment : BaseFragment<FragmentRecoveryBinding, RecoveryViewModel>(R.layout.fragment_recovery) {
    override val binding: FragmentRecoveryBinding by viewBinding(FragmentRecoveryBinding::bind)
    override val viewModel: RecoveryViewModel by viewModel()


}