package com.x7.nonushta2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.x7.nonushta2.models.HomeModel

class Home : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerView3: RecyclerView
    lateinit var recyclerView4: RecyclerView
    var arrayListpishiriq=ArrayList<HomeModel>()
    var arrayListshirinlik=ArrayList<HomeModel>()
    var arrayListquyuqtaom=ArrayList<HomeModel>()
    var arrayListichimlik=ArrayList<HomeModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView=view.findViewById(R.id.recyclerviewhome1)
        recyclerView2=view.findViewById(R.id.recyclerviewhome2)
        recyclerView3=view.findViewById(R.id.recyclerviewhome3)
        recyclerView4=view.findViewById(R.id.recyclerviewhome4)

        arrayListpishiriq=ArrayList()
        arrayListpishiriq.add(HomeModel(R.drawable.granolabaton,"Granola batonchalari"))
        arrayListpishiriq.add(HomeModel(R.drawable.pishloqlixachapuri,"Pishloqli xachapuri"))
        arrayListpishiriq.add(HomeModel(R.drawable.sutliquymoq,"Sutli qatlama Quymoq"))
        arrayListpishiriq.add(HomeModel(R.drawable.olmaliquymoq,"Olmali Quymoqchalar"))
        arrayListpishiriq.add(HomeModel(R.drawable.domboqquymoq,"Do'mboq Quymoqchalar"))
        arrayListpishiriq.add(HomeModel(R.drawable.yupqavafli,"Yupqa vaflilar"))
        arrayListpishiriq.add(HomeModel(R.drawable.yeryongonbananbaton,"Yeryong'oq va bananli batonchalar"))
        arrayListpishiriq.add(HomeModel(R.drawable.lavashlinaycha,"Kartoshka solib pishirilgan lavashli naychalar"))
        arrayListpishiriq.add(HomeModel(R.drawable.tvaroglibulochka,"Tvarogli bulochkalar"))
        arrayListpishiriq.add(HomeModel(R.drawable.qisqichbachalilavash,"Qisqichbaqa tayoqchalari asosida lavash"))

        arrayListshirinlik=ArrayList()
        arrayListshirinlik.add(HomeModel(R.drawable.fransuzchagrenka,"Fransuzcha grenkalar"))
        arrayListshirinlik.add(HomeModel(R.drawable.karamellipankeyk,"Karamelli pankeyklar"))
        arrayListshirinlik.add(HomeModel(R.drawable.shokoladlipankeyk,"Shokolad pastali pankeyklar"))
        arrayListshirinlik.add(HomeModel(R.drawable.qurabiya,"Qurabiya"))
        arrayListshirinlik.add(HomeModel(R.drawable.shokoladlisirniklar,"Shokoladli glazur bilan qoplangan sirniklar"))
        arrayListshirinlik.add(HomeModel(R.drawable.mevalinayskrim,"Mevali nayskrim"))
        arrayListshirinlik.add(HomeModel(R.drawable.tvarogyogurtbanan,"Tvarog va yogurt bilan pishirilgan bananlar"))
        arrayListshirinlik.add(HomeModel(R.drawable.yeryongoqlipasta,"Yeryong'oqli pasta"))

        arrayListquyuqtaom= ArrayList()
        arrayListquyuqtaom.add(HomeModel(R.drawable.tovadapishirilgantezpitsa,"Tovada pishirilgan tezkor pitsa"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.turkchaqovurilgantuxum,"Menemen - turkcha qovirilgan tuxum"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.gruchvaqovoqlibotqa,"Shirqavoq - guruch va qavoqli bo'tqa"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.qoziqornliquymoq,"Qoziqorinli mayin quymoq"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.grekchaquymoq,"<<Grekcha salat>> nomli parhezbop quymoq"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.nonushtabopgaletalar,"Nonushtabop galetalar"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.miqrotolqinlipechdaquymoq,"Miqroto'lqinli pechda quymoq pishirish"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.ispanchatortilyaquymoq,"Ispancha tortil'ya (quymoq)"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.ispanchaquymoqomlet,"Ispancha quymoq (omlet)"))
        arrayListquyuqtaom.add(HomeModel(R.drawable.tvoroglivareniklar,"Tvorogli vareniklar"))

        arrayListichimlik=ArrayList()
        arrayListichimlik.add(HomeModel(R.drawable.kivilismuzi,"Ismaloq va kividan tayorlangan smuzi"))
        arrayListichimlik.add(HomeModel(R.drawable.banalismuzi,"Qulupnay,yalpiz va bananli smuzi"))
        arrayListichimlik.add(HomeModel(R.drawable.bananvasutlikokteyl,"Banan va sutli kokteyl"))





        val homeAdapter=HomeAdapter(requireContext(),arrayListpishiriq)
        recyclerView.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter=homeAdapter

        val homeAdapter2=HomeAdapter(requireContext(),arrayListshirinlik)
        recyclerView2.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView2.adapter=homeAdapter2

        val homeAdapter3=HomeAdapter(requireContext(),arrayListquyuqtaom)
        recyclerView3.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView3.adapter=homeAdapter3

        val homeAdapter4=HomeAdapter(requireContext(),arrayListichimlik)
        recyclerView4.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView4.adapter=homeAdapter4





        return view
    }


}