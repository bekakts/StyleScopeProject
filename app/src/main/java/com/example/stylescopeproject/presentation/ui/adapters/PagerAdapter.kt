package com.example.stylescopeproject.presentation.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.stylescopeproject.presentation.ui.fragments.pager.company.CompaniesFragment
import com.example.stylescopeproject.presentation.ui.fragments.pager.designer.DesignerFragment

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CompaniesFragment()
            1 -> DesignerFragment()
            else -> CompaniesFragment()
        }
    }
}