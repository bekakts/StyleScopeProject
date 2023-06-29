package com.example.stylescopeproject.presentation.ui.adapters.company

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.stylescopeproject.databinding.ItemCompaniesBinding
import com.example.stylescopeproject.presentation.model.company.CompanyUI
import com.example.stylescopeproject.presentation.utils.loadImage

class CompanyAdapter : ListAdapter<CompanyUI, CompanyAdapter.CompanyViewHolder>(CompanyDiffCallback()) {
    class CompanyDiffCallback : DiffUtil.ItemCallback<CompanyUI>(){
        override fun areItemsTheSame(oldItem: CompanyUI, newItem: CompanyUI): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: CompanyUI, newItem: CompanyUI): Boolean =
            oldItem == newItem

    }

    class CompanyViewHolder(private val binding: ItemCompaniesBinding) : ViewHolder(binding.root) {
        fun onBind(model: CompanyUI?) {
            model?.image?.let { binding.itemImgCompany.loadImage(it) }
            binding.itemTvCompanyName.text = model?.title
            binding.itemTvCompanyDes.text = model?.summary
            binding.itemTvViews.text = model?.views.toString()
            val rating = model?.rating?.toFloat()
            binding.itemRatingImg.rating = rating!!
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CompanyViewHolder(
        ItemCompaniesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
    }
}