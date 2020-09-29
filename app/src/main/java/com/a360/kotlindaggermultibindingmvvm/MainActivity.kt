package com.a360.kotlindaggermultibindingmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.a360.kotlindaggermvvmmultibinding.componenets.DaggerMyComponenet
import com.a360.kotlindaggermvvmmultibinding.viewmodels.ViewModel1
import com.a360.kotlindaggermvvmmultibinding.viewmodels.ViewModel2
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    lateinit var viewModel1: ViewModel1
    lateinit var viewModel2: ViewModel2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMyComponenet.create().inject(this)
        viewModel1 = ViewModelProviders.of(this,factory).get(ViewModel1::class.java)
        viewModel2 = ViewModelProviders.of(this,factory).get(ViewModel2::class.java)


        viewModel1.callData()
        viewModel1.getMutableDataString().observe(this, Observer {
            text_1.text = it
        })

        viewModel2.callData()
        viewModel2.getMutableDataString().observe(this, Observer {
            text_2.text = it
        })


    }

}