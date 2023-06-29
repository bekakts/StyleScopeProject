package com.example.stylescopeproject.domain.use_cases.designer

import com.example.stylescopeproject.domain.repository.designer.DesignerRepository

class GetDetailDesignerUseCase(private val repository: DesignerRepository) {

    operator fun invoke(id: Int) = repository.getDetailDesigner(id)
}