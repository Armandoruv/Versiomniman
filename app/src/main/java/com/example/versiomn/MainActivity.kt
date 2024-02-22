package com.example.versiomn

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener { view ->
            if (Build.VERSION.SDK_INT >= 33) {
                /*
                arrayListOf(
                    android.Manifest.permission.CAMERA
                )
                */
                imageView.setImageResource(R.drawable.omnithicc)
                Toast.makeText(this, "Version Android >= 13", Toast.LENGTH_LONG).show()


            } else {
                /*
                arrayListOf(
                    android.Manifest.permission.CAMERA,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
                */
                imageView.setImageResource(R.drawable.omnojao)
                Toast.makeText(this, "Version Android < 13", Toast.LENGTH_LONG).show()
            }
        }
    }


}