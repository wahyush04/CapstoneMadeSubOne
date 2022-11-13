package com.wahyush04.capstonemadesubone.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.wahyush04.capstonemadesubone.R
import com.wahyush04.capstonemadesubone.databinding.ActivitySplashScreenBinding
import com.wahyush04.capstonemadesubone.ui.main.MainActivity
import com.wahyush04.core.Constant.SPLASH_SCREEN_DELAY

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, MainActivity::class.java)).also {
                finish()
            }
        }, SPLASH_SCREEN_DELAY.toLong())
    }
}