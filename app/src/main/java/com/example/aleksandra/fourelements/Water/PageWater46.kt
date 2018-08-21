package com.example.aleksandra.fourelements.Water

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aleksandra.fourelements.R
import kotlinx.android.synthetic.main.activity_page_water46.*

class PageWater46 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_water46)

        nicniezmieniaszBtn.setOnClickListener {
            val nicniezmienaszIntent = Intent (this, PageWater47::class.java)
            startActivity(nicniezmienaszIntent)
        }



    }
}
