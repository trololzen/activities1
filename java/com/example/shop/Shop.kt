package com.example.shop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent




class Shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop_layout)
    }

    fun back(view: View) {
        val intentBack = Intent(this, MainPage::class.java).apply{}
        startActivity(intentBack)
    }
}