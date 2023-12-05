package com.pos.user38.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.pos.user38.R
import com.pos.user38.adapter.BuyAgainAdapter
import com.pos.user38.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {

    private lateinit var binding:  FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater,container,false)

        setupRecyclerView()
        return binding.root
    }
    private fun setupRecyclerView(){
        val buyAgainCoffeeName = arrayListOf("Iced Matcha", "Iced Macchiato")
        val buyAgainCoffeePrice = arrayListOf("₱38", "₱38")
        val buyAgainCoffeeImage = arrayListOf(R.drawable.menu1, R.drawable.menu2)
        buyAgainAdapter = BuyAgainAdapter(buyAgainCoffeeName, buyAgainCoffeePrice, buyAgainCoffeeImage)
        binding.historyRecyclerView.adapter = buyAgainAdapter
        binding.historyRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
    companion object {

    }
}