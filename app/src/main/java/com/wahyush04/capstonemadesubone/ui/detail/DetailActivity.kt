package com.wahyush04.capstonemadesubone.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyush04.capstonemadesubone.R
import com.wahyush04.capstonemadesubone.databinding.ActivityDetailBinding
import com.wahyush04.capstonemadesubone.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var activityDetailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}