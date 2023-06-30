package com.example.stylescopeproject.presentation.ui.fragments.pager.designer.detail

import com.example.stylescopeproject.core.BaseViewModel
import com.example.stylescopeproject.domain.use_cases.designer.GetDetailDesignerUseCase
import com.example.stylescopeproject.presentation.model.designer.DesignerDetailUI
import com.example.stylescopeproject.presentation.model.designer.toUI
import kotlinx.coroutines.flow.asStateFlow

class DetailDesignerViewModel(private val getDetailDesignerUseCase: GetDetailDesignerUseCase) : BaseViewModel() {

    private val _state = mutableUIStateFlow<DesignerDetailUI>()
    val state = _state.asStateFlow()

    fun getDetailCompanies(id: Int) {
        getDetailDesignerUseCase(id).gatherRequest(_state){ it.toUI() }
    }
}