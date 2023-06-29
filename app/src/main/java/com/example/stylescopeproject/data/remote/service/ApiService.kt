package com.example.stylescopeproject.data.remote.service

import com.example.stylescopeproject.data.base.BaseMainResponse
import com.example.stylescopeproject.data.remote.dtos.company.CompanyDetailDto
import com.example.stylescopeproject.data.remote.dtos.company.CompanyDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("companies")
    suspend fun getCompanies(): BaseMainResponse<CompanyDto>

    @GET("companies/{id}")
    suspend fun getDetailCompany(@Path("id")id: Int): CompanyDetailDto
}