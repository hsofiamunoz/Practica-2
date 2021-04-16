package com.hsofiamunoz.whimfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hsofiamunoz.whimfood.databinding.ActivityLoginBinding
import com.hsofiamunoz.whimfood.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var  registroBinding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registroBinding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(registroBinding.root)


        registroBinding.registerButton.setOnClickListener {
            // VAriables
            val intent = Intent(this, LoginActivity::class.java)
            val name = registroBinding.fullnameRegisterInputText.text.toString()
            val email_register = registroBinding.emailRegisterInputText.text.toString()
            val password = registroBinding.passwordRegisterInputText.text.toString()
            val rep_password = registroBinding.repeatPasswordInputText.text.toString()

            startActivity(intent)
            finish()


        }



    }





}