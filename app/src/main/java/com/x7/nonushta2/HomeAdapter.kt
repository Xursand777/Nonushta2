package com.x7.nonushta2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.databinding.RecyclerviewItemhomeBinding
import com.x7.nonushta2.models.HomeModel

class HomeAdapter constructor(
    val context: Context,
    val arrayList: ArrayList<HomeModel>
):RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view=RecyclerviewItemhomeBinding.inflate(LayoutInflater.from(context),parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
       holder.binding.imageviewhome.setImageResource(arrayList.get(position).image)
        holder.binding.textviewhome.text=arrayList.get(position).names

        holder.binding.cardviewac2.setOnClickListener {
          val intent=Intent(context,MainActivity2::class.java)
            intent.putExtra("image",arrayList.get(position).image)
            intent.putExtra("names",arrayList.get(position).names)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int =arrayList.size

    class HomeViewHolder(val binding: RecyclerviewItemhomeBinding): RecyclerView.ViewHolder(binding.root)


}