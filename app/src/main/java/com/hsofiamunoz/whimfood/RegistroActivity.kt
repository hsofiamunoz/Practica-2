package com.hsofiamunoz.whimfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsofiamunoz.whimfood.databinding.ActivityLoginBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var  registroBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registroBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(registroBinding.root)
    }
}