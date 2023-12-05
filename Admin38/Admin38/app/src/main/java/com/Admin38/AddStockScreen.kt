package com.Admin38

import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddStockScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addstock_screen)
        val imageView: ImageView = findViewById(R.id.imageView4)
        imageView.setOnClickListener {val intent = Intent(this, DashboardScreenActivity::class.java)
            startActivity(intent)
            // handle your click here!
        }
    }
}


