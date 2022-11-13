package com.wahyush04.capstonemadesubone.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyush04.capstonemadesubone.R
import com.wahyush04.capstonemadesubone.databinding.ActivityMainBinding
import com.wahyush04.capstonemadesubone.di.viewModelModule
import com.wahyush04.core.adapter.NewsAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var newsAdapter: NewsAdapter

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}