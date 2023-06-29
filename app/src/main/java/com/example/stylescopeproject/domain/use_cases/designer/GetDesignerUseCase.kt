package com.example.stylescopeproject.domain.use_cases.designer

import com.example.stylescopeproject.domain.repository.company.CompanyRepository
import com.example.stylescopeproject.domain.repository.designer.DesignerRepository

class GetDesignerUseCase(private val repository: DesignerRepository) {

    operator fun invoke() = repository.getDesigners()
}