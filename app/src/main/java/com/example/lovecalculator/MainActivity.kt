package com.example.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val activityViewModel:ActivityViewModel by viewModels ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val navController = findNavController(R.id.nav_host_fragment)
//
//        if (!activityViewModel.getUserSeen()){
//            navController.navigate(R.id.onBordFragment)
//        }
        //        if (!pref.isUserSeen()) {
        //            navController.navigate(R.id.bordFragment)
        //        }
    }
}