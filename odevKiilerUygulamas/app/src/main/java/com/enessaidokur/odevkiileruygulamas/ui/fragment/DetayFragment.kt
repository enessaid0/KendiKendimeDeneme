package com.enessaidokur.odevkiileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.enessaidokur.odevkiileruygulamas.R
import com.enessaidokur.odevkiileruygulamas.data.entity.toDos
import com.enessaidokur.odevkiileruygulamas.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?, ): View? {
    binding = FragmentDetayBinding.inflate(inflater, container, false)

    binding.toolbarDetay.title = "Görev Detay"

    val bundle:DetayFragmentArgs by navArgs()
    val gelenGorev = bundle.gorev

    binding.buttonGuncelle.setOnClickListener {
        val gorev = binding.editTextGorev.text.toString()
        guncelle(gelenGorev.id,gorev)
    }

    return binding.root}
    fun guncelle(id:Int,gorev:String){
        Log.e("Görev Güncelle","$id-$gorev")
    }

}