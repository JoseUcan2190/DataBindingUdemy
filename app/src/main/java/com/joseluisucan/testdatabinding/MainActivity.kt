package com.joseluisucan.testdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.joseluisucan.testdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var contador:Int = 0
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get()

        //LIVE DATA
        binding.modelo = viewModel
        binding.lifecycleOwner = this

        //binding.tvContador2.text = viewModel.contador.toString()

        binding.btnUno.setOnClickListener {
            aumentarContador()
            viewModel.aumentarContador()

            //COMENTAR EN  LIVE DATA
            //binding.tvContador2.text = viewModel.contador.toString()
        }
    }

    private fun aumentarContador() {
        contador++
        binding.tvContador.text = contador.toString()
    }


}