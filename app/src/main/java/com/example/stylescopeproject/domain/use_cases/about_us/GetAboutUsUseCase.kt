package com.example.stylescopeproject.domain.use_cases.about_us

import com.example.stylescopeproject.domain.repository.about_us.AboutUsRepository

class GetAboutUsUseCase(private val repository: AboutUsRepository) {

    operator fun invoke() = repository.getAboutUs()
}