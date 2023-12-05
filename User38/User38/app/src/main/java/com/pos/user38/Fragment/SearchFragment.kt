package com.pos.user38.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.pos.user38.R
import com.pos.user38.adapter.MenuAdapter
import com.pos.user38.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter : MenuAdapter
    private var originalMenuCoffeeName = listOf("Iced Macchiato", "Iced Matcha", "Iced Chocolate", "Iced Mocha")
    private val originalMenuPrice = listOf("₱38", "₱38", "₱38", "₱38")
    private val originalMenuImages = listOf(R.drawable.menu2, R.drawable.menu1, R.drawable.menu4, R.drawable.menu3)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val filteredMenuCoffeeName = mutableListOf<String>()
    private val filteredMenuItemPrice = mutableListOf<String>()
    private val filteredMenuImage = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        adapter = MenuAdapter(filteredMenuCoffeeName, filteredMenuItemPrice, filteredMenuImage)
        binding.searchRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.searchRecyclerView.adapter = adapter


        setupSearchView()

        showAllMenu()
        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuCoffeeName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        filteredMenuCoffeeName.addAll(originalMenuCoffeeName)
        filteredMenuItemPrice.addAll(originalMenuPrice)
        filteredMenuImage.addAll(originalMenuImages)

        adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItems(newText)
                return true
            }
        })
    }

    private fun filterMenuItems(query: String) {
        filteredMenuCoffeeName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()
        originalMenuCoffeeName.forEachIndexed { index, coffeeName ->
            if (coffeeName.contains(query, ignoreCase = true)) {
                filteredMenuCoffeeName.add(coffeeName)
                filteredMenuItemPrice.add(originalMenuPrice[index])
                filteredMenuImage.add(originalMenuImages[index])
            }
        }
        adapter.notifyDataSetChanged()
    }

    companion object {

    }
}