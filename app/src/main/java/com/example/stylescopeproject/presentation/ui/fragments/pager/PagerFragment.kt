package com.example.stylescopeproject.presentation.ui.fragments.pager

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.stylescopeproject.R
import com.example.stylescopeproject.core.BaseFragmentWithoutViewModel
import com.example.stylescopeproject.databinding.FragmentPagerBinding
import com.example.stylescopeproject.presentation.ui.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : BaseFragmentWithoutViewModel<FragmentPagerBinding>(R.layout.fragment_pager) {
    override val binding: FragmentPagerBinding by viewBinding(FragmentPagerBinding::bind)

        override fun initialize() {
        initPagerTabs()
    }

    private fun initPagerTabs() {
        binding.pager.adapter = PagerAdapter(this)
        val fragmentsTabs = listOf(
            "Компании",
            "Дизайнеры"
        )

        TabLayoutMediator(binding.pagerTab, binding.pager) { tab, position ->
            tab.text = fragmentsTabs[position]
        }.attach()
    }

}