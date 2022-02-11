package com.rendiputra.pengenalanbintangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlanets : RecyclerView
    private var list: ArrayList<Planet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        rvPlanets = findViewById(R.id.rv_planets)
        rvPlanets.setHasFixedSize(true)

        list.addAll(PlanetData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvPlanets.layoutManager = LinearLayoutManager(this)
        val homeCardView = HomeCardView(list)
        rvPlanets.adapter = homeCardView
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val about = Intent(this@MainActivity, About::class.java)
                startActivity(about)
            }
        }
    }
}