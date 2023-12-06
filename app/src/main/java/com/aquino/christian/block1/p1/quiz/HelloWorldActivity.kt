package com.aquino.christian.block1.p1.quiz

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HelloWorldActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        // Initialize MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.sample)
        mediaPlayer.start()

    }
    override fun onDestroy() {
        super.onDestroy()
        // Release the MediaPlayer when the activity is destroyed
        mediaPlayer.release()
    }
}
