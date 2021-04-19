package com.hsofiamunoz.whimfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.hsofiamunoz.whimfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Variables se crean en el ONCREATE
        // On create se encarga de cerrar la operacion por completo si presiono hacia atras <
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher_round)
        supportActionBar!!.title = Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>")


        val data = intent.extras
        mainBinding.emailTextView.text = data?.getString("email")

        val passwordLogin = data?.getString("password")


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
                intent.putExtra("email_login",mainBinding.emailTextView.text.toString())
                //intent.putExtra("password_login",password_login)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }



    override fun onStart(){     // La actividad está a punto de ser mostrada al usuario
        super.onStart()
        Log.d("metodo","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("metodo","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metodo","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("metodo","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("metodo","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("metodo","onDestroy")
    }

}