package com.example.stylescopeproject.presentation.ui.adapters.designer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.stylescopeproject.databinding.ItemDesignersBinding
import com.example.stylescopeproject.presentation.model.designer.DesignerUI
import com.example.stylescopeproject.presentation.utils.loadImage

class DesignerAdapter(private val click: (id: Int) -> Unit) : ListAdapter<DesignerUI, DesignerAdapter.DesignerViewHolder>(DesignerDiffCallback()) {
    class DesignerDiffCallback : DiffUtil.ItemCallback<DesignerUI>(){
        override fun areItemsTheSame(oldItem: DesignerUI, newItem: DesignerUI): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: DesignerUI, newItem: DesignerUI): Boolean =
            oldItem == newItem

    }

    inner class DesignerViewHolder(private val binding: ItemDesignersBinding) : ViewHolder(binding.root){
        fun onBind(model: DesignerUI?) {
            model?.photo?.let { binding.itemImgEmployee.loadImage(it) }
            binding.itemDesignTitle.text = model?.companyTitle?.get(0)
            binding.itemDesignTitle.text = model?.companyTitle?.get(0)
            binding.itemTvEmployeeName.text = model?.name
            binding.itemTvEmployeeProfession.text = model?.occupation
            binding.itemTvRating.text = model?.rating
            val rating = model?.rating?.toFloat()
            binding.itemRatingBar.rating = rating!!

            itemView.setOnClickListener {
                click(model.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DesignerViewHolder(
        ItemDesignersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: DesignerViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
    }
}