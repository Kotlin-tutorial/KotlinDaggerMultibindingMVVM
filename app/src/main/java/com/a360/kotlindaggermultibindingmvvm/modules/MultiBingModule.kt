package com.a360.kotlindaggermvvmmultibinding.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.a360.kotlindaggermvvmmultibinding.factories.DaggerViewModelFactory
import com.a360.kotlindaggermvvmmultibinding.viewmodels.ViewModel1
import com.a360.kotlindaggermvvmmultibinding.viewmodels.ViewModel2
import com.a360.kotlindaggermvvmmultibinding.viewmodels.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class MultiBingModule {
    @Binds
    abstract fun bindsViewModelFactory(factory: DaggerViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey (ViewModel1::class)
    abstract fun bindMainViewModel1(viewModel: ViewModel1):ViewModel

    @Binds
    @IntoMap
    @ViewModelKey (ViewModel2::class)
    abstract fun bindMainViewModel2(viewModel: ViewModel2):ViewModel

}