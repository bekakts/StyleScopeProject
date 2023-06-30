package com.example.stylescopeproject.data.remote.repository.designer

import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.data.base.makeNetworkRequest
import com.example.stylescopeproject.data.remote.service.ApiService
import com.example.stylescopeproject.domain.model.designer.DesignerDetailModel
import com.example.stylescopeproject.domain.model.designer.DesignerModel
import com.example.stylescopeproject.domain.repository.designer.DesignerRepository
import kotlinx.coroutines.flow.Flow

class DesignerRepositoryImpl(private val apiService: ApiService) : DesignerRepository {
    override fun getDesigners(): Flow<Either<String, List<DesignerModel>>> = makeNetworkRequest {
        apiService.getDesigners().map { it.toDomain() }
    }

    override fun getDetailDesigner(id: Int): Flow<Either<String, DesignerDetailModel>> = makeNetworkRequest {
        apiService.getDetailDesigner(id).toDomain()
    }
}