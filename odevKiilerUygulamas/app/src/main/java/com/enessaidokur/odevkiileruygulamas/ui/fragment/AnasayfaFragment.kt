package com.enessaidokur.odevkiileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.enessaidokur.odevkiileruygulamas.R
import com.enessaidokur.odevkiileruygulamas.data.entity.toDos
import com.enessaidokur.odevkiileruygulamas.databinding.FragmentAnasayfaBinding
import com.enessaidokur.odevkiileruygulamas.ui.adapter.GorevlerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        val gorevListesi = ArrayList<toDos>()
            val g1 = toDos(1,"Yemek Yap")
            val g2 = toDos(2,"Bulaşıkları Yıka")
            val g3 = toDos(3,"Evi Süpür")
            gorevListesi.add(g1)
            gorevListesi.add(g2)
            gorevListesi.add(g3)
        val gorevlerAdapter = GorevlerAdapter(requireContext(),gorevListesi)
        binding.rv.adapter = gorevlerAdapter

        binding.fab.setOnClickListener{
        Navigation.findNavController(it).navigate(R.id.kayitGecis)
        }


        binding.SearchView.setOnQueryTextListener(object : OnQueryTextListener{
            // arama ikonuna bastığımıda sonuç getiren yapı
            override fun onQueryTextSubmit(p0: String): Boolean {
                ara(p0)
                return true
            }

            // Hrf girdikçe veya sildikçe sonuç getiren
            override fun onQueryTextChange(p0: String): Boolean {
                ara(p0)
                 return true
            }


        })

        return binding.root }
fun ara(aramakelimesi:String){
    Log.e("Görev Ara",aramakelimesi)
}

}