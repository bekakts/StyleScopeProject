package com.example.stylescopeproject.domain.repository.designer

import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.domain.model.designer.DesignerDetailModel
import com.example.stylescopeproject.domain.model.designer.DesignerModel
import kotlinx.coroutines.flow.Flow

interface DesignerRepository {

    fun getDesigners(): Flow<Either<String, List<DesignerModel>>>
    fun getDetailDesigner(id: Int): Flow<Either<String, DesignerDetailModel>>
}