package com.example.stylescopeproject.presentation

import android.app.Application
import com.example.stylescopeproject.data.remote.module.repoModule
import com.example.stylescopeproject.data.remote.module.retrofitModule
import com.example.stylescopeproject.domain.module.useCasesModule
import com.example.stylescopeproject.presentation.module.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class StyleScopeApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@StyleScopeApp)
            modules(retrofitModule, repoModule, useCasesModule, uiModule)
        }
    }
}