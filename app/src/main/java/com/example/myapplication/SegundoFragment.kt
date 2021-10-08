package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object{
        private const val NOMBRE = "nombre"
        private const val EDAD = "edad"

        fun newInstance(nombre: String, edad: Int) = SegundoFragment().apply{

        }

    }

}