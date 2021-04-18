package com.hsofiamunoz.whimfood

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hsofiamunoz.whimfood.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var  loginBinding: ActivityLoginBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        // Cuando se oprime el boton de iniciat sesion, se cambia a Main activity
        loginBinding.loginButton.setOnClickListener {

            // Variables
            val intent = Intent(this, MainActivity::class.java)
            val email = loginBinding.emailInputText.text.toString()
            val password = loginBinding.passwordInputText.text.toString()

            var data = intent.extras
            loginBinding.prueba.text = data?.getString("email_register") + "\n" + email

            // En el Login si la contraseña y el correo estan vacios se muestra un mensaje
            if (email.isNotEmpty() && password.isNotEmpty()){
                //if (data_register?.getString("email_register") == email){
                    intent.putExtra("email", email)
                    intent.putExtra("password",password)


                    //startActivity(intent)
                    //finish()
                //}
                //else
                  //  Toast.makeText(this,"ERROR", Toast.LENGTH_SHORT).show()
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