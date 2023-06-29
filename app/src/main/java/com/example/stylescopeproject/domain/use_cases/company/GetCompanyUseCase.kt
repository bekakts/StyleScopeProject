package com.example.stylescopeproject.domain.use_cases.company

import com.example.stylescopeproject.domain.repository.company.CompanyRepository

class GetCompanyUseCase(private val repository: CompanyRepository) {

    operator fun invoke() = repository.getCompanies()
}