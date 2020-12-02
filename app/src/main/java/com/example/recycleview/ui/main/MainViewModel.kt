package com.example.recycleview.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var list = MutableLiveData<MutableList<Person>>(
           mutableListOf<Person>(Person("yosi"),Person("rafi"))
    )


}


class Person(var age : String){

    fun getPerson(age: Int):String{
        return age.toString()
    }
}