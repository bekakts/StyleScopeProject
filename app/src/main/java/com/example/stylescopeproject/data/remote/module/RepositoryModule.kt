package com.example.stylescopeproject.data.remote.module

import com.example.stylescopeproject.data.remote.repository.company.CompanyRepositoryImpl
import com.example.stylescopeproject.data.remote.repository.designer.DesignerRepositoryImpl
import com.example.stylescopeproject.domain.repository.company.CompanyRepository
import com.example.stylescopeproject.domain.repository.designer.DesignerRepository
import org.koin.dsl.module

val repoModule = module {
    single<CompanyRepository> { CompanyRepositoryImpl(get()) }
    single<DesignerRepository> { DesignerRepositoryImpl(get()) }
}