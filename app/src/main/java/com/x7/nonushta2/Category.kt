package com.x7.nonushta2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.models.CategoryModel
import com.x7.nonushta2.models.FoodModel

class Category : Fragment() {
   lateinit var recyclerView: RecyclerView

    var arrayList2=ArrayList<FoodModel>()
   var arrayList = ArrayList<CategoryModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_category, container, false)
        recyclerView=view.findViewById(R.id.recyclerview1)



          arrayList=ArrayList()
          arrayList.add(CategoryModel(R.drawable.yupqavafli,R.drawable.pishiriqlar,"Pishiriqlar"))
          arrayList.add(CategoryModel(R.drawable.karamellipankeyk,R.drawable.shirinliklar,"Shirinliklar"))
          arrayList.add(CategoryModel(R.drawable.tovadapishirilgantezpitsa,R.drawable.quyuqtaomlar,"Quyuq taomlar"))
          arrayList.add(CategoryModel(R.drawable.banalismuzi,R.drawable.ichimliklar,"Ichimliklar"))




          recyclerView.layoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)
          val categoryAdapter =CategoryAdapter(requireContext(),arrayList)
          recyclerView.adapter=categoryAdapter



        return view
    }

    fun showtoast(){
        Toast.makeText(context,"xaxaxa",Toast.LENGTH_SHORT).show()
    }

    fun recyclerviewfoodchange(pos:Int){


    }


}