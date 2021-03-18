package com.rendi.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity(), View.OnClickListener {

    // mendeklariskan companion object supaya dapat diakses oleh kelas lainnya
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        // mengenalkan TextView tv_data_received sebagai tvDataReceived
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        // mendeklarasikan variabel name, age dengan menerima value yang dikirim melalui method putExtra() dari MainActivity
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        // mengubah  tvDataReceived: TextView berdasarkan variabel text
        val  text = "Name: $name, \nYour Age : $age"
        tvDataReceived.text = text

        val btnKembaliData: Button = findViewById(R.id.btn_kembali_data)
        btnKembaliData.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id) {

            // aksi saat onClick berdasarkan id
            R.id.btn_kembali_data -> {
                val kembali = Intent(this@MoveWithDataActivity, MainActivity::class.java)
                startActivity(kembali)
            }
        }
    }
}