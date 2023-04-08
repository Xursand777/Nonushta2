package com.x7.nonushta2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.models.FoodModel
import com.x7.nonushta2.models.HomeModel


class Pr : Fragment() {

    lateinit var recyclerView2: RecyclerView
    lateinit var arrayList2:ArrayList<FoodModel>
    lateinit var arrayList3:ArrayList<FoodModel>
    lateinit var arrayListquyuqtaom:ArrayList<FoodModel>
    lateinit var arrayListichimlik:ArrayList<FoodModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arrayList2= ArrayList()
        arrayList2.add(FoodModel(R.drawable.granolabaton,"Granola batonchalari","40 min"))
        arrayList2.add(FoodModel(R.drawable.pishloqlixachapuri,"Pishloqli xachapuri","50 min"))
        arrayList2.add(FoodModel(R.drawable.sutliquymoq,"Sutli qatlama Quymoq","60 min"))
        arrayList2.add(FoodModel(R.drawable.olmaliquymoq,"Olmali Quymoqchalar","20 min"))
        arrayList2.add(FoodModel(R.drawable.domboqquymoq,"Do'mboq Quymoqchalar","40 min"))
        arrayList2.add(FoodModel(R.drawable.yupqavafli,"Yupqa vaflilar","50 min"))
        arrayList2.add(FoodModel(R.drawable.yeryongonbananbaton,"Yeryong'oq va bananli batonchalar","30 min"))
        arrayList2.add(FoodModel(R.drawable.lavashlinaycha,"Kartoshka solib pishirilgan lavashli naychalar","40 min"))
        arrayList2.add(FoodModel(R.drawable.tvaroglibulochka,"Tvarogli bulochkalar","60 min"))
        arrayList2.add(FoodModel(R.drawable.qisqichbachalilavash,"Qisqichbaqa tayoqchalari asosida lavash","20 min"))

        arrayList3=ArrayList()
        arrayList3.add(FoodModel(R.drawable.fransuzchagrenka,"Fransuzcha grenkalar","40"))
        arrayList3.add(FoodModel(R.drawable.karamellipankeyk,"Karamelli pankeyklar","30"))
        arrayList3.add(FoodModel(R.drawable.shokoladlipankeyk,"Shokolad pastali pankeyklar","20"))
        arrayList3.add(FoodModel(R.drawable.qurabiya,"Qurabiya","50"))
        arrayList3.add(FoodModel(R.drawable.shokoladlisirniklar,"Shokoladli glazur bilan qoplangan sirniklar","50"))
        arrayList3.add(FoodModel(R.drawable.mevalinayskrim,"Mevali nayskrim","30"))
        arrayList3.add(FoodModel(R.drawable.tvarogyogurtbanan,"Tvarog va yogurt bilan pishirilgan bananlar","40"))
        arrayList3.add(FoodModel(R.drawable.yeryongoqlipasta,"Yeryong'oqli pasta","45"))

        arrayListquyuqtaom= ArrayList()
        arrayListquyuqtaom.add(FoodModel(R.drawable.tovadapishirilgantezpitsa,"Tovada pishirilgan tezkor pitsa","30"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.turkchaqovurilgantuxum,"Menemen - turkcha qovirilgan tuxum","20"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.gruchvaqovoqlibotqa,"Shirqavoq - guruch va qavoqli bo'tqa","60"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.qoziqornliquymoq,"Qoziqorinli mayin quymoq","45"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.grekchaquymoq,"<<Grekcha salat>> nomli parhezbop quymoq","55"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.nonushtabopgaletalar,"Nonushtabop galetalar","30"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.miqrotolqinlipechdaquymoq,"Miqroto'lqinli pechda quymoq pishirish","60"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.ispanchatortilyaquymoq,"Ispancha tortil'ya (quymoq)","40"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.ispanchaquymoqomlet,"Ispancha quymoq (omlet)","50"))
        arrayListquyuqtaom.add(FoodModel(R.drawable.tvoroglivareniklar,"Tvorogli vareniklar","60"))

        arrayListichimlik=ArrayList()
        arrayListichimlik.add(FoodModel(R.drawable.kivilismuzi,"Ismaloq va kividan tayorlangan smuzi","40"))
        arrayListichimlik.add(FoodModel(R.drawable.banalismuzi,"Qulupnay,yalpiz va bananli smuzi","45"))
        arrayListichimlik.add(FoodModel(R.drawable.bananvasutlikokteyl,"Banan va sutli kokteyl","45"))

        var pos: Int? =null
        val bundle=this.arguments
        if (bundle!=null){
           pos= bundle.getInt("pos")
        }

        val view=inflater.inflate(R.layout.fragment_pr, container, false)
        recyclerView2=view.findViewById(R.id.recyclerviewfood)
        when (pos){
            0->{

                recyclerView2.layoutManager= LinearLayoutManager(context)
                val foodAdapter=FoodAdapter(requireContext(),arrayList2)
                recyclerView2.adapter=foodAdapter
            }
            1->{
                recyclerView2.layoutManager= LinearLayoutManager(context)
                val foodAdapter=FoodAdapter(requireContext(),arrayList3)
                recyclerView2.adapter=foodAdapter
            }
            2->{
                recyclerView2.layoutManager= LinearLayoutManager(context)
                val foodAdapter=FoodAdapter(requireContext(),arrayListquyuqtaom)
                recyclerView2.adapter=foodAdapter
            }
            3->{
                recyclerView2.layoutManager= LinearLayoutManager(context)
                val foodAdapter=FoodAdapter(requireContext(),arrayListichimlik)
                recyclerView2.adapter=foodAdapter
            }
        }
        return view
    }


}