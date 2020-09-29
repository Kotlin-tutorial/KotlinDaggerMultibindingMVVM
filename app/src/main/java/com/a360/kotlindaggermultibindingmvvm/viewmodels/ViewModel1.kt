package com.a360.kotlindaggermvvmmultibinding.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.a360.kotlindaggermvvmmultibinding.repositories.Repository1
import javax.inject.Inject

class ViewModel1 @Inject constructor() : ViewModel(){


    var repository1 = Repository1()
    var mutableLiveData  = MutableLiveData<String>()

    fun callData(){
        repository1.getMutableData()
    }

    fun getMutableDataString () : MutableLiveData<String>{
        mutableLiveData = repository1.getMutableDataString()
        return mutableLiveData
    }
}