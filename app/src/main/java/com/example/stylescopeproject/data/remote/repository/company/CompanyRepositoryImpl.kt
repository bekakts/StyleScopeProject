package com.example.stylescopeproject.data.remote.repository.company

import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.data.base.makeNetworkRequest
import com.example.stylescopeproject.data.remote.service.ApiService
import com.example.stylescopeproject.domain.model.company.CompanyDetailModel
import com.example.stylescopeproject.domain.model.company.CompanyModel
import com.example.stylescopeproject.domain.repository.company.CompanyRepository
import kotlinx.coroutines.flow.Flow

class CompanyRepositoryImpl(private val apiService: ApiService) : CompanyRepository {
    override fun getCompanies(): Flow<Either<String, List<CompanyModel>>> = makeNetworkRequest {
        apiService.getCompanies().map { it.toDomain() }
    }

    override fun getDetailCompany(id: Int): Flow<Either<String, CompanyDetailModel>> = makeNetworkRequest {
        apiService.getDetailCompany(id).toDomain()
    }
}