package com.pos.user38.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pos.user38.R
import com.pos.user38.adapter.MenuAdapter
import com.pos.user38.databinding.FragmentMenuBottomSheetBinding


class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding:FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener{
            dismiss()
        }
        val menuCoffeeName = listOf("Iced Macchiato", "Iced Matcha", "Iced Chocolate", "Iced Mocha")
        val menuPrice = listOf("₱38", "₱38", "₱38", "₱38")
        val menuImages = listOf(R.drawable.menu2, R.drawable.menu1, R.drawable.menu4, R.drawable.menu3)
        val adapter = MenuAdapter(ArrayList(menuCoffeeName), ArrayList(menuPrice), ArrayList(menuImages))
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}