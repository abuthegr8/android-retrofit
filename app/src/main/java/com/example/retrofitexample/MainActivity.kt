package com.example.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.security.Provider.Service

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userAPI = RetrofitHelper.getInstance().create(UserAPI::class.java)
        GlobalScope.launch {
            val result = userAPI.getUser()
            Log.d("Sample Result: ", result.body().toString())
        }
    }
}