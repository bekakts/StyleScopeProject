package com.example.stylescopeproject.domain.use_cases.company

import com.example.stylescopeproject.domain.repository.company.CompanyRepository

class GetDetailCompanyUseCase(private val repository: CompanyRepository) {

    operator fun invoke(id: Int) = repository.getDetailCompany(id)
}