package com.example.stylescopeproject.data.remote.service

import com.example.stylescopeproject.data.base.BaseMainResponse
import com.example.stylescopeproject.data.remote.dtos.company.CompanyDetailDto
import com.example.stylescopeproject.data.remote.dtos.company.CompanyDto
import com.example.stylescopeproject.data.remote.dtos.company.DesignerDto
import com.example.stylescopeproject.data.remote.dtos.designer.Designer
import com.example.stylescopeproject.data.remote.dtos.designer.DesignerDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("companies")
    suspend fun getCompanies(): BaseMainResponse<CompanyDto>

    @GET("companies/{id}")
    suspend fun getDetailCompany(@Path("id")id: Int): CompanyDetailDto


    @GET("designers")
    suspend fun getDesigners(): BaseMainResponse<Designer>

    @GET("designers/{id}")
    suspend fun getDetailDesigner(@Path("id") id: Int): DesignerDetailDto
}