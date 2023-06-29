package com.example.stylescopeproject.domain.repository.company

import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.domain.model.company.CompanyDetailModel
import com.example.stylescopeproject.domain.model.company.CompanyModel
import kotlinx.coroutines.flow.Flow

interface CompanyRepository {

    fun getCompanies(): Flow<Either<String, List<CompanyModel>>>
    fun getDetailCompany(id: Int): Flow<Either<String, CompanyDetailModel>>
}