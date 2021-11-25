package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Variables.users_data.put("admin","1111")
    }

    fun login_button(view: View) {
        var loginStr = findViewById<EditText>(R.id.login).text.toString()
        var passwordStr = findViewById<EditText>(R.id.password).text.toString()
        if(Variables.users_data.containsKey(loginStr)){
            if(Variables.users_data[loginStr].equals(passwordStr)){
                //login successful
                val intent = Intent(this, MainPage::class.java).apply{}
                startActivity(intent)
            }
            else{
                findViewById<TextView>(R.id.wrong_data).setText("Wrong password!")
            }
        }
        else{
            findViewById<TextView>(R.id.wrong_data).setText("There is no account with given login.")
        }
    }

    fun create_account(view: View) {
        val intentCreateAcc = Intent(this, CreateAccount::class.java).apply{}
        startActivity(intentCreateAcc)
    }
}