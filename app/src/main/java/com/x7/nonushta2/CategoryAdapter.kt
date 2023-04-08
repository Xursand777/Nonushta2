package com.x7.nonushta2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.databinding.RecyclerviewItemcategoryBinding
import com.x7.nonushta2.models.CategoryModel


class CategoryAdapter constructor(
    val context: Context,
    val arrayList: ArrayList<CategoryModel>
):RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

     var category=Category()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view= RecyclerviewItemcategoryBinding.inflate(LayoutInflater.from(context),parent,false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.imageviewnonushta.setImageResource(arrayList.get(position).image)
        holder.binding.imageviewrasmcategory.setImageResource(arrayList.get(position).imagebackgroud)
        holder.binding.textviewcategoryname.text=arrayList.get(position).name

        holder.binding.cardview1.setOnClickListener {

                val bundle=Bundle()
                bundle.putInt("pos", position)
                val pr=Pr()
                pr.arguments=bundle

            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.linearlay1,pr).commit()

        }
    }

    override fun getItemCount(): Int =arrayList.size

    class CategoryViewHolder(val binding: RecyclerviewItemcategoryBinding):RecyclerView.ViewHolder(binding.root)

}