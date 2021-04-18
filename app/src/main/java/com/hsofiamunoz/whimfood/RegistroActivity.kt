package com.hsofiamunoz.whimfood

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hsofiamunoz.whimfood.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var  registroBinding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registroBinding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(registroBinding.root)


        registroBinding.registerButton.setOnClickListener {
            // Variables
            val intent = Intent(this, LoginActivity::class.java)
            val name = registroBinding.fullnameRegisterInputText.text.toString()
            val email_register = registroBinding.emailRegisterInputText.text.toString()
            val password_register = registroBinding.passwordRegisterInputText.text.toString()
            val rep_password_register = registroBinding.repeatPasswordInputText.text.toString()

            if (name.isNotEmpty() && email_register.isNotEmpty() && password_register.isNotEmpty() && rep_password_register.isNotEmpty()){
                if(password_register == rep_password_register){
                    startActivity(intent)
                    intent.putExtra("email_register",email_register)
                    intent.putExtra("password_register",password_register)
                    //finish()
                }
                else{
                    Toast.makeText(this, getString(R.string.password_error),Toast.LENGTH_SHORT).show()
                }

            }
            else
                Toast.makeText(this,"Ingresar parámetros faltantes",Toast.LENGTH_SHORT).show()

        }



    }





}