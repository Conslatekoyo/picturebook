package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureActivityLast : AppCompatActivity() {
    lateinit var btnlast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_last)
        btnlast=findViewById(R.id.btnlast)
        btnlast.setOnClickListener {
            val intent=Intent(this,PictureActivity4::class.java)
            startActivity(intent)
        }


    }
}