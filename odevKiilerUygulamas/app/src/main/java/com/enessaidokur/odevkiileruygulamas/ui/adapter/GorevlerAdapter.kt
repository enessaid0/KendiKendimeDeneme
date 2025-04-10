package com.enessaidokur.odevkiileruygulamas.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.enessaidokur.odevkiileruygulamas.data.entity.toDos
import com.enessaidokur.odevkiileruygulamas.databinding.CardTasarimBinding import com.enessaidokur.odevkiileruygulamas.ui.fragment.AnasayfaFragmentDirections

class GorevlerAdapter(var mContext:Context, var gorevlerListesi:List<toDos>)
    : RecyclerView.Adapter<GorevlerAdapter.cardTasrimTutucu>() {

    // CardTasarimBinding card_tasarim.xml in bir class ı oldu.
 inner class cardTasrimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasrimTutucu {
 val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return  cardTasrimTutucu(binding)
    }

    // Bu fonksiyon kartla alakalı tıklama gibi vesaire işleri yapmamızı sağlıyor.
    // Buraya kadar herşey aşağı yukarı aynı burdan sonra karta göre kodluyorsunuz
    override fun onBindViewHolder(holder: cardTasrimTutucu, position: Int) {
        val gorev = gorevlerListesi.get(position)
        val t = holder.tasarim
        t.textViewGorev.text = gorev.name

        t.CardViewSatir.setOnClickListener {

            val gecis = AnasayfaFragmentDirections.detayGecis(gorev = gorev)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int { // kac tane item var bunu soruyor
        return gorevlerListesi.size
    }

}