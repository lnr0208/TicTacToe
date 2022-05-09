package com.isayevapps.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        val playButton = findViewById<Button>(R.id.playButton)
        playButton.setOnClickListener{
            val intent = Intent(this, PlayerSetupActivity::class.java)
            startActivity(intent)
        }
    }
}