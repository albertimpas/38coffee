package com.Admin38

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AllItems : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_item)
        val imageView: ImageView = findViewById(R.id.imageView9)
        imageView.setOnClickListener {val intent = Intent(this, DashboardScreenActivity::class.java)
            startActivity(intent)
            // handle your click here!
        }
    }
}
