package com.joseluisucan.testdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var contador = 0

    //AGREGAR DESPUES (LIVE DATA)
    var contadorLive = MutableLiveData<Int>()


    init {
        contadorLive.value = 0
    }

    fun aumentarContador(){
        contador++
        contadorLive.value = contadorLive.value?.plus(1)
    }
}