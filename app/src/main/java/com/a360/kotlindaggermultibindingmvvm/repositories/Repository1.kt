package com.a360.kotlindaggermvvmmultibinding.repositories

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class Repository1  @Inject constructor() {

    var mutableLiveData  = MutableLiveData<String>()

    fun getMutableData(){
        mutableLiveData.value = "This is repository 1"
    }

    fun getMutableDataString () : MutableLiveData<String>{
        return mutableLiveData
    }
}