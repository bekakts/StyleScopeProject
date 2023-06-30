package com.example.stylescopeproject.presentation.module

import com.example.stylescopeproject.presentation.ui.fragments.pager.company.CompaniesViewModel
import com.example.stylescopeproject.presentation.ui.fragments.pager.company.detail.DetailCompanyVIewModel
import com.example.stylescopeproject.presentation.ui.fragments.pager.designer.DesignerViewModel
import com.example.stylescopeproject.presentation.ui.fragments.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { CompaniesViewModel(get()) }
    viewModel { DetailCompanyVIewModel(get()) }
    viewModel { DesignerViewModel(get()) }
    viewModel { MainViewModel(get(), get()) }
}