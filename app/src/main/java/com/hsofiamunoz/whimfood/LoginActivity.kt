package com.hsofiamunoz.whimfood

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hsofiamunoz.whimfood.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var  loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variables del intent y Binding

        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        val data_register = intent.extras
        val data_login = intent.extras

        // Cuando se oprime el boton de iniciat sesion, se cambia a Main activity
        loginBinding.loginButton.setOnClickListener {

            // Variables locales
            val intent = Intent(this, MainActivity::class.java)
            val email = loginBinding.emailInputText.text.toString()
            val password = loginBinding.passwordInputText.text.toString()


            // En el Login si la contraseña y el correo estan vacios se muestra un mensaje
            if (email.isNotEmpty() && password.isNotEmpty()){

                // Registro Primera vez.

                if (data_register?.getString("email_register") == email){ // Se compara el correo ingrersado con el que se registra

                    if(data_register.getString("password_register") == password){ // Se compara la contraseña  con la que se registra
                        intent.putExtra("email", email)
                        intent.putExtra("password",password)
                        startActivity(intent)
                        finish()
                    }
                    else
                        Toast.makeText(this,getString(R.string.password_error),Toast.LENGTH_SHORT).show()
                }
                else
                    Toast.makeText(this,"ERROR", Toast.LENGTH_SHORT).show()

                // Ingresardespues de cerrar sesion

                if (data_login?.getString("email_login") == email){
                    //intent.putExtra("email", email)
                    //intent.putExtra("password",password)
                    startActivity(intent)
                    finish()
                }
                else
                   Toast.makeText(this,"ERROR", Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,getString(R.string.login_error), Toast.LENGTH_SHORT).show()

        }

        // Si se presiona el texto de Registrarse, se abre RegistroActivity
        loginBinding.registerLink.setOnClickListener{
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}