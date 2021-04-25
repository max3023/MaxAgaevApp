package com.example.maxagaevapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLogMAct", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMAct", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogMAct", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMAct", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMAct", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMAct", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMAct", "onDestroy")
    }
}