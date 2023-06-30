package com.example.stylescopeproject.presentation.ui.fragments.pager.designer

import com.example.stylescopeproject.core.BaseViewModel
import com.example.stylescopeproject.domain.use_cases.designer.GetDesignerUseCase
import com.example.stylescopeproject.presentation.model.designer.DesignerUI
import com.example.stylescopeproject.presentation.model.designer.toUI
import kotlinx.coroutines.flow.asStateFlow

class DesignerViewModel(
    private val getDesignerUseCase: GetDesignerUseCase
) : BaseViewModel() {

    private val _designerState = mutableUIStateFlow<List<DesignerUI>>()
    val companyState get() = _designerState.asStateFlow()

    init {
        getCompanies()
    }
    fun getCompanies() {
        getDesignerUseCase().gatherRequest(_designerState) { designers -> designers.map { it.toUI() } }
    }
}