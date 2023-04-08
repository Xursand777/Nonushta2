package com.x7.nonushta2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.databinding.RecyclerviewItemfoodBinding
import com.x7.nonushta2.models.FoodModel

class FoodAdapter constructor(
    val context: Context,
    val arrayList: ArrayList<FoodModel>
):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view=RecyclerviewItemfoodBinding.inflate(LayoutInflater.from(context),parent,false)
        return FoodViewHolder(view)
    }
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.binding.apply {
            imageviewfood.setImageResource(arrayList.get(position).image)
            textviewfood.text=arrayList.get(position).namee
            textviewtimer.text=arrayList.get(position).timers
        }
    }

    override fun getItemCount(): Int =arrayList.size

    class FoodViewHolder(val binding: RecyclerviewItemfoodBinding):RecyclerView.ViewHolder(binding.root)
}