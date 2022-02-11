package com.rendiputra.pengenalanbintangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeCardView (private val listPlanet: ArrayList<Planet>): RecyclerView.Adapter<HomeCardView.CardViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_home_card_view, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val planet = listPlanet[position]

        Glide.with(holder.itemView.context)
            .load(planet.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = planet.name
        holder.tvDetail.text = planet.detail
        val mContext = holder.itemView.context
        holder.btnDetail.setOnClickListener {
            val moveDetail = Intent(mContext, PlanetDetail::class.java)
            moveDetail.putExtra(PlanetDetail.EXTRA_NAME, planet.name)
            moveDetail.putExtra(PlanetDetail.EXTRA_DETAIL, planet.detail)
            moveDetail.putExtra(PlanetDetail.EXTRA_JENIS, planet.jenis)
            moveDetail.putExtra(PlanetDetail.EXTRA_PHOTO, planet.photo)
            moveDetail.putExtra(PlanetDetail.EXTRA_JARIJARI, planet.jariJari)
            moveDetail.putExtra(PlanetDetail.EXTRA_LUASPERMUKAAN, planet.luasPermukaan)
            moveDetail.putExtra(PlanetDetail.EXTRA_VOLUME, planet.volume)
            moveDetail.putExtra(PlanetDetail.EXTRA_MASSA, planet.massa)
            moveDetail.putExtra(PlanetDetail.EXTRA_ATMOSFER, planet.atmosfer)
            mContext.startActivity(moveDetail)
        }

        // TODO: ngirim data list ke detail_planet.xml + PlanetDetail.kt
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, PlanetDetail::class.java)
            moveDetail.putExtra(PlanetDetail.EXTRA_NAME, planet.name)
            moveDetail.putExtra(PlanetDetail.EXTRA_DETAIL, planet.detail)
            moveDetail.putExtra(PlanetDetail.EXTRA_JENIS, planet.jenis)
            moveDetail.putExtra(PlanetDetail.EXTRA_PHOTO, planet.photo)
            moveDetail.putExtra(PlanetDetail.EXTRA_JARIJARI, planet.jariJari)
            moveDetail.putExtra(PlanetDetail.EXTRA_LUASPERMUKAAN, planet.luasPermukaan)
            moveDetail.putExtra(PlanetDetail.EXTRA_VOLUME, planet.volume)
            moveDetail.putExtra(PlanetDetail.EXTRA_MASSA, planet.massa)
            moveDetail.putExtra(PlanetDetail.EXTRA_ATMOSFER, planet.atmosfer)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listPlanet.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }
}