package com.example.stylescopeproject.presentation.module

import com.example.stylescopeproject.presentation.ui.fragments.CompaniesViewModel
import com.example.stylescopeproject.presentation.ui.fragments.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { CompaniesViewModel(get()) }
    viewModel { MainViewModel(get()) }
}