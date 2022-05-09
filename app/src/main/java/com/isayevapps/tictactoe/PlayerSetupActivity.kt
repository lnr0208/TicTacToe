package com.isayevapps.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerSetupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_setup)

        val homeButton = findViewById<Button>(R.id.homeButton)
        val startButton = findViewById<Button>(R.id.startButton)
        homeButton.setOnClickListener{ this.onBackPressed() }
        startButton.setOnClickListener{
            TODO(" Go to Game Board Activity")
        }
    }
}