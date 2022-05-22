package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureActivity3 : AppCompatActivity() {
    lateinit var btn4:Button
    lateinit var btn5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        btn4=findViewById(R.id.btn4)
        btn4.setOnClickListener {
            val intent=Intent(this,PictureActivity2::class.java)
            startActivity(intent)
        }
        btn5=findViewById(R.id.btn5)
        btn5.setOnClickListener {
            val intent=Intent(this,PictureActivity4::class.java)
            startActivity(intent)
        }
    }
}