package com.mani.keepnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.mani.keepnotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(findNavController(R.id.navhost_fragment))
    }
//To change action bar with fragment
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.navhost_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}