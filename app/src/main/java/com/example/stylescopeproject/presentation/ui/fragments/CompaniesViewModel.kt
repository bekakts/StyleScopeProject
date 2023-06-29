package com.example.stylescopeproject.presentation.ui.fragments

import com.example.stylescopeproject.core.BaseViewModel
import com.example.stylescopeproject.domain.use_cases.company.GetCompanyUseCase
import com.example.stylescopeproject.presentation.model.company.CompanyUI
import com.example.stylescopeproject.presentation.model.company.toUI
import kotlinx.coroutines.flow.asStateFlow

class CompaniesViewModel(
    private val getCompanyUseCase: GetCompanyUseCase
) : BaseViewModel() {

    private val _companyState = mutableUIStateFlow<List<CompanyUI>>()
    val companyState get() = _companyState.asStateFlow()

    init {
        getCompanies()
    }
    fun getCompanies() {
        getCompanyUseCase().gatherRequest(_companyState) { companies -> companies.map { it.toUI() } }
    }
}