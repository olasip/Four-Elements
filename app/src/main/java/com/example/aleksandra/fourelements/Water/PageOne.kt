package com.example.aleksandra.fourelements

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_one.*

class PageOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_one)

        pageOneWaterBtn.setOnClickListener {
            val waterIntent = Intent (this, PageWater46::class.java)
            startActivity(waterIntent)
        }
    }


}
