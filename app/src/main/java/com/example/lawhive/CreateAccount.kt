package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class CreateAccount : AppCompatActivity() {

    lateinit var edt_username2: EditText
    lateinit var edt_password2: EditText
    lateinit var edt_email2: EditText
    lateinit var edt_age: EditText
    lateinit var edt_phonenumber: EditText
    lateinit var btn_login2: Button
    lateinit var Radio_Button2: RadioButton
    lateinit var Radio_Button: RadioButton
    lateinit var btn_createacc2: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        edt_password2 = findViewById(R.id.txtpasssword2)
        edt_username2 = findViewById(R.id.textusername2)
        edt_email2= findViewById(R.id.txtemail2)
        Radio_Button = findViewById(R.id.radioButton)
        Radio_Button2= findViewById(R.id.radioButton2)
        edt_phonenumber= findViewById(R.id.edtphonenumber)
        edt_age= findViewById(R.id.edtage)
        btn_login2 = findViewById(R.id.btnlogin2)
        btn_createacc2 = findViewById(R.id.btncreateaccount2)




        btn_login2.setOnClickListener {
            //takes you to create an account
            val gotologin = Intent(this, LoginActivity::class.java)
            startActivity(gotologin)

        }


    }
}