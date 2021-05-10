package com.hsofiamunoz.bottomnavigation

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController


class MainActivity : AppCompatActivity() {

    private var email_login : String = " "
    private var password_login : String = " "

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher_round)
        supportActionBar!!.title = Html.fromHtml("<font color=\"#1F177E\">" + getString(R.string.app_name) + "</font>")

        setContentView(R.layout.activity_main)

        val data = intent.extras
        email_login = data?.getString("email").toString()
        password_login = data?.getString("password").toString()

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_discover, R.id.navigation_account))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
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
                intent.putExtra("email_login", email_login)
                intent.putExtra("password_login", password_login)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}