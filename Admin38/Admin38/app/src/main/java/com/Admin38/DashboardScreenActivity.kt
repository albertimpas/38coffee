package com.Admin38

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.Admin38.AddStockScreen // replace with the correct package if it's different

class DashboardScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard_screen)

        val seeItemsLayout: ConstraintLayout = findViewById(R.id.seeitems)
        seeItemsLayout.setOnClickListener {
            val intent = Intent(this, AllItems::class.java)
            startActivity(intent)
        }
        val addItemLayout: ConstraintLayout = findViewById(R.id.addItem)
        addItemLayout.setOnClickListener {
            val intent = Intent(this, AddStockScreen::class.java)
            startActivity(intent)
        }
        val logoutLayout: ConstraintLayout = findViewById(R.id.logoutClicked)
        logoutLayout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
