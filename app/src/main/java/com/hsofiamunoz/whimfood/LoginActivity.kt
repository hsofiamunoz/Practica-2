package com.hsofiamunoz.whimfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsofiamunoz.whimfood.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var  loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

    }
}