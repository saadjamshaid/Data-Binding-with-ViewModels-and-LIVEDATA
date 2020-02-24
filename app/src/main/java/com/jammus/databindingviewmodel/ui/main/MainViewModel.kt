package com.jammus.databindingviewmodel.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel


    private val _num = MutableLiveData<Int>()
    val num: LiveData<Int>
    get() = _num


    init {
        _num.value = 0
    }


    fun NumIncrement (){
        _num.value = _num.value?.plus(1)
    }


}
