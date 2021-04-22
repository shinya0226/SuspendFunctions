package com.example.suspendfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val networkCallAnswer1 = doNetWorkCall1()
            val networkCallAnswer2 = doNetWorkCall2()

            Log.d(TAG, networkCallAnswer1)
            Log.d(TAG, networkCallAnswer2)

        }
    }

    suspend fun doNetWorkCall1() : String{
        delay(3000L)
        return "This is the answer"
    }

    suspend fun doNetWorkCall2() : String{
        delay(3000L)
        return "This is the answer"
    }

}