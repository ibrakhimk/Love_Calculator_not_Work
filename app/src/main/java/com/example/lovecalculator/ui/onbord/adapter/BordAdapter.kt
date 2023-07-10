package com.example.lovecalculator.ui.onbord.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lovecalculator.databinding.ItemBordBinding
import com.example.lovecalculator.data.model.OnBord

class BordAdapter(val onClick: () -> Unit) : Adapter<BordAdapter.BordViewHolder>() {

    val list = arrayListOf(
        OnBord("", "title", "description"),
        OnBord("", "title", "description"),
        OnBord("", "title", "description"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BordViewHolder =
        BordViewHolder(
            ItemBordBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: BordViewHolder, position: Int) =
        holder.onBind(list[position])

    inner class BordViewHolder(private val binding: ItemBordBinding) : ViewHolder(binding.root) {
        fun onBind(onBord: OnBord) {
            binding.tvTitle.text = onBord.title
            binding.tvDesc.text = onBord.desc
            if (position == list.lastIndex) {
                binding.btnSkip.visibility = View.VISIBLE
            }
            binding.btnSkip.setOnClickListener {
                onClick()
            }
        }
    }
}