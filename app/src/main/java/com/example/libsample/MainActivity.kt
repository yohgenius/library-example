package com.example.libsample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tanya_bestie.TanyaActivity


class MainActivity : AppCompatActivity() {

    lateinit var tanyaBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tanyaBtn = findViewById(R.id.tanya_btn)
        tanyaBtn.setOnClickListener {
            val tanyaBestie = Intent(this, TanyaActivity::class.java)
            startActivity(tanyaBestie)
        }
    }
}