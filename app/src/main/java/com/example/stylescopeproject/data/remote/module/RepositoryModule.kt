package com.example.stylescopeproject.data.remote.module

import com.example.stylescopeproject.data.remote.repository.company.CompanyRepositoryImpl
import com.example.stylescopeproject.domain.repository.company.CompanyRepository
import org.koin.dsl.module

val repoModule = module {
    single<CompanyRepository> { CompanyRepositoryImpl(get()) }
}