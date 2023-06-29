package com.example.stylescopeproject.domain.module

import com.example.stylescopeproject.domain.use_cases.about_us.GetAboutUsUseCase
import com.example.stylescopeproject.domain.use_cases.company.GetCompanyUseCase
import com.example.stylescopeproject.domain.use_cases.company.GetDetailCompanyUseCase
import com.example.stylescopeproject.domain.use_cases.designer.GetDesignerUseCase
import com.example.stylescopeproject.domain.use_cases.designer.GetDetailDesignerUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory { GetCompanyUseCase(get()) }
    factory { GetDetailCompanyUseCase(get()) }
    factory { GetDesignerUseCase(get()) }
    factory { GetDetailDesignerUseCase(get()) }
    factory { GetAboutUsUseCase(get()) }
}