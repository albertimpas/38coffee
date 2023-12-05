package com.pos.user38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.pos.user38.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChooseLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_location)

        binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val locationList = arrayOf("Mandaue", "Cebu", "Consolacion", "Bogo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, locationList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter

    }
}