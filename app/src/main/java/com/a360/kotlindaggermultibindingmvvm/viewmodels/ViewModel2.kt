package com.a360.kotlindaggermvvmmultibinding.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.a360.kotlindaggermvvmmultibinding.repositories.Repository1
import com.a360.kotlindaggermvvmmultibinding.repositories.Repository2
import javax.inject.Inject

class ViewModel2  @Inject constructor(): ViewModel(){


    var repository2 = Repository2()
    var mutableLiveData  = MutableLiveData<String>()

    fun callData(){
        repository2.getMutableData()
    }

    fun getMutableDataString () : MutableLiveData<String>{
        mutableLiveData = repository2.getMutableDataString()
        return mutableLiveData
    }
}