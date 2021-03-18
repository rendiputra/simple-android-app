package com.rendi.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mengenalkan tombol btn_move_activity sebagai btnMoveActivity
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this) // event onClik

        // mengenalkan tombol btn_move_activity_data sebagai btnMoveWithDataActivity
        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        // mengenalkan tombol btn_dial_number sebagai btnDialPhone
        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v?.id) {

            // aksi saat onClick berdasarkan id
            R.id.btn_move_activity -> {
                // pindah activity tanpa membawa data (explicit Intent)
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            // aksi saat onClick berdasarkan id
            R.id.btn_move_activity_data -> {
                // pindah activity dengan membawa data (explicit Intent)
                val moveWithDataActivity = Intent (this@MainActivity, MoveWithDataActivity::class.java)
                // membawa data dengan method putExtra(KEY_NAME, nilainya)
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_NAME, "Rendi Putra Pradana" )
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_AGE, 19)
                startActivity(moveWithDataActivity)
            }

            // aksi saat onClick berdasarkan id
            R.id.btn_dial_number -> {
                // Implicit intent
                val phoneNumber = "08581234123"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

        }
    }

}