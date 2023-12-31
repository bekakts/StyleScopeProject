package com.example.stylescopeproject.presentation.ui.adapters.company.company_package

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.stylescopeproject.databinding.ItemPackageBinding
import com.example.stylescopeproject.presentation.model.company.CompanyPackageUI
import com.example.stylescopeproject.presentation.model.company.ServicesUI

class CompanyPackageAdapter : androidx.recyclerview.widget.ListAdapter<ServicesUI, CompanyPackageAdapter.CompanyPackageViewHolder>(
    CompanyPackageDiffCallback()
) {
    class CompanyPackageDiffCallback : DiffUtil.ItemCallback<ServicesUI>(){
        override fun areItemsTheSame(oldItem: ServicesUI, newItem: ServicesUI): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: ServicesUI, newItem: ServicesUI): Boolean =
            oldItem == newItem

    }

    class CompanyPackageViewHolder(private val binding: ItemPackageBinding) : ViewHolder(binding.root) {
        fun onBind(model: ServicesUI) {
            binding.itemTvPackageTitle.text = model.title
            binding.itemTvPackageDesc.text = model.description

            var serviceDescState = false
            val serviceDesc = model.description
            binding.itemTvPackageTitle.setOnClickListener {
                if (!serviceDescState && serviceDesc.isNotEmpty()) {
                    binding.itemTvPackageDesc.isVisible = true
                    serviceDescState = true
                } else {
                    binding.itemTvPackageDesc.isGone = true
                    serviceDescState = false
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CompanyPackageViewHolder(
        ItemPackageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )
    override fun onBindViewHolder(holder: CompanyPackageViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
    }
}