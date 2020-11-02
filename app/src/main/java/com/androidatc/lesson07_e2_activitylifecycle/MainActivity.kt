package com.androidatc.lesson07_e2_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"onCreate method is working now",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"onStart method is running now",Toast.LENGTH_LONG).show()
    }

    fun shutdown(view: View) {
        onDestroy()
    }
}
