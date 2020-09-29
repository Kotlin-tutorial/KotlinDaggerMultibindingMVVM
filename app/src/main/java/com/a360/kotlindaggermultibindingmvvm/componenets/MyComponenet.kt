package com.a360.kotlindaggermvvmmultibinding.componenets

import com.a360.kotlindaggermultibindingmvvm.MainActivity
import com.a360.kotlindaggermvvmmultibinding.modules.MultiBingModule
import dagger.Component

@Component(modules = [MultiBingModule::class])
interface MyComponenet {
    fun inject (mainActivity: MainActivity)
}