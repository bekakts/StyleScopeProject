package com.example.stylescopeproject.domain.repository.about_us

import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.presentation.model.about_us.AboutUI
import kotlinx.coroutines.flow.Flow

interface AboutUsRepository {

    fun getAboutUs(): Flow<Either<String, AboutUI>>
}