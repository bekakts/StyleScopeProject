package com.example.stylescopeproject.core

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.viewbinding.ViewBinding
import com.example.stylescopeproject.common.Either
import com.example.stylescopeproject.common.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class BaseFragmentWithoutViewModel<Binding : ViewBinding>
    (@LayoutRes layoutId: Int) : Fragment(layoutId) {

    protected abstract val binding: Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        constructListeners()
        launchObservers()
    }

    protected open fun initialize() {}

    protected open fun constructListeners() {}

    protected open fun launchObservers() {}
}