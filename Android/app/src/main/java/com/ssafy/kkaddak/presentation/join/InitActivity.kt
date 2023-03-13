package com.ssafy.kkaddak.presentation.join

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.ssafy.kkaddak.R
import com.ssafy.kkaddak.databinding.ActivityInitBinding

class InitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInitBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_init) as NavHostFragment
        navController = navHostFragment.navController

        val graphInflater = navController.navInflater
        val navGraph = graphInflater.inflate(R.navigation.navigation_init)

        //navGraph.setStartDestination(startDestination)
        navController.graph = navGraph

    }
}