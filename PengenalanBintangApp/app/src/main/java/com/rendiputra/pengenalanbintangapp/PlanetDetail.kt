package com.rendiputra.pengenalanbintangapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PlanetDetail : AppCompatActivity()  {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_JENIS = "extra_jenis"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_JARIJARI = "extra_jari_jari"
        const val EXTRA_LUASPERMUKAAN = "extra_luas_permukaan"
        const val EXTRA_VOLUME = "extra_volume"
        const val EXTRA_MASSA = "extra_massa"
        const val EXTRA_ATMOSFER = "extra_atmosfer"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_planet)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail " + intent.getStringExtra(EXTRA_JENIS)
        actionbar.setDisplayHomeAsUpEnabled(true)

        // set
        val tvSetName: TextView = findViewById(R.id.tv_name_planet)
        val imgSetPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvSetJenis: TextView = findViewById(R.id.tv_jenis)
        val tvSetDesc: TextView = findViewById(R.id.tv_detail_deskripsi)
        val tvSetJariJari: TextView = findViewById(R.id.tv_jari_jari)
        val tvSetLuasPermukaan: TextView = findViewById(R.id.tv_luas_permukaan)
        val tvSetVolume: TextView = findViewById(R.id.tv_volume)
        val tvSetMassa: TextView = findViewById(R.id.tv_massa)
        val tvSetAtmosfer: TextView = findViewById(R.id.tv_atmosfer)

        // membaca data
        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tIDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tJenis = intent.getStringExtra(EXTRA_JENIS)
        val tPhoto = intent.getStringExtra(EXTRA_PHOTO)
        val tJariJari = intent.getStringExtra(EXTRA_JARIJARI)
        val tLuasPermukaan = intent.getStringExtra(EXTRA_LUASPERMUKAAN)
        val tVolume = intent.getStringExtra(EXTRA_VOLUME)
        val tMassa = intent.getStringExtra(EXTRA_MASSA)
        val tAtmosfer = intent.getStringExtra(EXTRA_ATMOSFER)

        Glide.with(this)
            .load(tPhoto)
            .dontAnimate()
            .apply(RequestOptions())
            .into(imgSetPhoto)

        tvSetName.text = tName
        tvSetJenis.text = tJenis
        tvSetDesc.text = tIDetail
        tvSetJariJari.text = tJariJari
        tvSetLuasPermukaan.text = tLuasPermukaan
        tvSetVolume.text = tVolume
        tvSetMassa.text = tMassa
        tvSetAtmosfer.text = tAtmosfer
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}