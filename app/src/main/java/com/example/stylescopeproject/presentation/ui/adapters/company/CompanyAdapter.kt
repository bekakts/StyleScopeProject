package com.example.stylescopeproject.presentation.ui.adapters.company

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.stylescopeproject.databinding.ItemCompaniesBinding
import com.example.stylescopeproject.presentation.model.company.CompanyUI

class CompanyAdapter(private val click: (id: Int) -> Unit) : ListAdapter<CompanyUI, CompanyAdapter.CompanyViewHolder>(CompanyDiffCallback()) {
    class CompanyDiffCallback : DiffUtil.ItemCallback<CompanyUI>(){
        override fun areItemsTheSame(oldItem: CompanyUI, newItem: CompanyUI): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: CompanyUI, newItem: CompanyUI): Boolean =
            oldItem == newItem

    }

    inner class CompanyViewHolder(private val binding: ItemCompaniesBinding) : ViewHolder(binding.root) {
        fun onBind(model: CompanyUI?) {
            Glide.with(binding.root).load(model?.image).centerCrop().into(binding.itemImgCompany)
            binding.itemTvCompanyName.text = model?.title
            binding.itemTvCompanyDes.text = model?.summary
            binding.itemTvViews.text = model?.views.toString()
            val rating = model?.rating?.toFloat()
            binding.itemRatingImg.rating = rating!!

            itemView.setOnClickListener {
                click(model.id)
            }
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