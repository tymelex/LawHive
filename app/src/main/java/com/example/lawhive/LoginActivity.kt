package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    lateinit var edt_username: EditText
    lateinit var edt_password: EditText
    lateinit var edt_email: EditText
    lateinit var btn_login: Button
    lateinit var btn_createacc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        edt_password = findViewById(R.id.txtpasssword)
        edt_username = findViewById(R.id.textusername)
        edt_email= findViewById(R.id.txtemail)
        btn_login = findViewById(R.id.btnlogin)
        btn_createacc = findViewById(R.id.btncreateacc)

        btn_createacc.setOnClickListener {
            //takes you to create an account
            val gotocreateaccount = Intent(this, CreateAccount::class.java)
            startActivity(gotocreateaccount)

        }


    }
}