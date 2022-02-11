package com.rendiputra.pengenalanbintangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val imageSplash: ImageView = findViewById(R.id.splash_image)

        imageSplash.alpha = 0f
        imageSplash.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent =Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }


    }
}