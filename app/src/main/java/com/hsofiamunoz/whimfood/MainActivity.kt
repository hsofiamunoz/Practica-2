package com.hsofiamunoz.whimfood

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.hsofiamunoz.whimfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher_round)
        supportActionBar!!.title = Html.fromHtml("<font color=\"#1F177E\">" + getString(R.string.app_name) + "</font>")

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val data = intent.extras


        mainBinding.emailTextView.text = data?.getString("email")
    }

    // Función para cerrar la sesion
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.logout_menu -> {
                val  intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("email_login", mainBinding.emailTextView.text)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)

    }



}