package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureActivity2 : AppCompatActivity() {
    lateinit var btnTwo:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        btnTwo=findViewById(R.id.btnTwo)
        btnTwo.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn3=findViewById(R.id.btn3)
        btn3.setOnClickListener {
            val intent=Intent(this,PictureActivity3::class.java)
            startActivity(intent)
        }
    }
}