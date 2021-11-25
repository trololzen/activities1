package com.example.shop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
    }

    fun back(view: View) {
        val intentBack = Intent(this, MainPage::class.java).apply{}
        startActivity(intentBack)
    }
}