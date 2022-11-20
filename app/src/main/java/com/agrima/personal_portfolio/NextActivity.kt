package com.agrima.personal_portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.next_activity)

//        val bubble = findViewById<ImageView>(R.id.bubble)
//        bubble.setOnClickListener{
//         val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/agrima-gupta-ag18"))
//            startActivity(intent)
//        }

    }

    fun linked(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/agrima-gupta-ag18"))
        startActivity(intent)
    }

}