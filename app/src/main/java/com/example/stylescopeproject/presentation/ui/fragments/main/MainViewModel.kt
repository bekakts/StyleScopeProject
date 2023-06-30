package com.example.stylescopeproject.presentation.ui.fragments.main

import com.example.stylescopeproject.core.BaseViewModel
import com.example.stylescopeproject.domain.use_cases.company.GetCompanyUseCase
import com.example.stylescopeproject.domain.use_cases.designer.GetDesignerUseCase
import com.example.stylescopeproject.presentation.model.company.CompanyUI
import com.example.stylescopeproject.presentation.model.company.DesignerUI
import com.example.stylescopeproject.presentation.model.company.toUI
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(
    private val getCompanyUseCase: GetCompanyUseCase,
    private val getDesignerUseCase: GetDesignerUseCase
): BaseViewModel() {


    private val _companyState = mutableUIStateFlow<List<CompanyUI>>()
    val companyState get() = _companyState.asStateFlow()

    private val _designerState = mutableUIStateFlow<List<DesignerUI>>()
    val designerState get() = _designerState.asStateFlow()
    init {
        getCompanies()
    }

    private fun getCompanies() {
        getCompanyUseCase().gatherRequest(_companyState) { companies -> companies.map { it.toUI() }}
    }

    private fun getDesigners() {
        getDesignerUseCase().gatherRequest(_designerState) { designers -> designers.map { it.toUI() }}
    }
}