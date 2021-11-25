package com.example.shop

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
public lateinit var music_cats_on_mars: MediaPlayer

class MainPage : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_layout)
    }

    fun easter_egg(view: View) {
        music_cats_on_mars = MediaPlayer.create(this, R.raw.cats_on_mars)
        music_cats_on_mars.start()
    }

    fun go_to_shop(view: View) {
        val intent2 = Intent(this, Shop::class.java).apply{}
        startActivity(intent2)
    }

    fun logout(view: View) {
        val intent_logout = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent_logout)
    }

    fun about(view: View) {
        val intent_about = Intent(this, About::class.java).apply{}
        startActivity(intent_about)
    }

}