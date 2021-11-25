package com.example.shop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_account_layout)
    }

    fun returnBack(view: View) {
        val intentBack = Intent(this, MainActivity::class.java).apply{}
        startActivity(intentBack)
    }

    fun create_confirm(view: View) {
        var new_login = findViewById<EditText>(R.id.new_login).text.toString()
        var new_password1 = findViewById<EditText>(R.id.new_password1).text.toString()
        var new_password2 = findViewById<EditText>(R.id.new_password2).text.toString()
        if(new_password1.equals(new_password2)){
            Variables.users_data.put(new_login, new_password1)
            findViewById<Button>(R.id.create_new_acc_button).setText("Success!")
        }
        else{
            findViewById<Button>(R.id.create_new_acc_button).setText("Passwords dont match!")
        }
    }

}