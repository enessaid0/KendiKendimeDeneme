package com.enessaidokur.odevkiileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enessaidokur.odevkiileruygulamas.R
import com.enessaidokur.odevkiileruygulamas.databinding.FragmentKayitBinding
import kotlin.math.log


class KayitFragment : Fragment() {
    private lateinit var binding: FragmentKayitBinding
override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
    binding = FragmentKayitBinding.inflate(inflater, container, false)

   binding.toolbarKayit.title = "Görev Kayıt"
    binding.buttonKaydet.setOnClickListener {
        val gorev = binding.editTextGorev.text.toString()
        kaydet(gorev)
    }



    return binding.root
    }
fun kaydet(gorev:String){
Log.e("Görev Kaydet","$gorev")
}

}