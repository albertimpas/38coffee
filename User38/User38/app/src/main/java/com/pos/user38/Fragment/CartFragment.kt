package com.pos.user38.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.pos.user38.R
import com.pos.user38.adapter.CartAdapter
import com.pos.user38.adapter.PopularAdapter
import com.pos.user38.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCartBinding.inflate(inflater,container, false)




        val cartCoffeeName = listOf("Iced Macchiato", "Iced Matcha", "Iced Chocolate", "Iced Mocha")
        val cartItemPrice = listOf("₱38", "₱38", "₱38", "₱38")
        val cartImage = listOf(R.drawable.menu2, R.drawable.menu1, R.drawable.menu4, R.drawable.menu3)
        val adapter = CartAdapter(ArrayList(cartCoffeeName), ArrayList(cartItemPrice), ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}