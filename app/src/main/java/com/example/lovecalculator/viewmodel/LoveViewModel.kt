package com.example.lovecalculator.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculator.data.remote.LoveModel
import com.example.lovecalculator.repositury.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository,private val pref:SharedPreferences) : ViewModel() {

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getPercentage(firstName, secondName)
    }

//    fun saveUserSeen(){
//        pref.edit().putBoolean(USER_SEEN,true).apply()
//    }

    fun getUserSeen():Boolean{
        return pref.getBoolean(USER_SEEN,false)
    }

    companion object{
        const val USER_SEEN = "key_seen"
    }

}