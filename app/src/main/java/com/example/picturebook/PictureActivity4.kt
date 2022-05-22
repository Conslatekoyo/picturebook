package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureActivity4 : AppCompatActivity() {
    lateinit var btn6:Button
    lateinit var btn7Next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        btn6=findViewById(R.id.btn6)
        btn6.setOnClickListener {
            val intent=Intent(this,PictureActivity3::class.java)
            startActivity(intent)
        }
        btn7Next=findViewById(R.id.btn7Next)
        btn7Next.setOnClickListener {
            val intent=Intent(this,PictureActivityLast::class.java)
            startActivity(intent)
        }
        }
    }
