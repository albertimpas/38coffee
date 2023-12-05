package com.pos.user38.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pos.user38.databinding.BuyAgainItemBinding

class BuyAgainAdapter(private val buyAgainCoffeeName:ArrayList<String>,
                      private val buyAgainCoffeePrice:ArrayList<String>, private val buyAgainCoffeeImage:ArrayList<Int>) :
    RecyclerView.Adapter<BuyAgainAdapter.BuyAgainViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyAgainViewHolder {
        val binding = BuyAgainItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuyAgainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BuyAgainViewHolder, position: Int) {
        holder.bind(buyAgainCoffeeName[position],buyAgainCoffeePrice[position], buyAgainCoffeeImage[position])
    }

    override fun getItemCount(): Int = buyAgainCoffeeName.size

    class BuyAgainViewHolder(private val binding: BuyAgainItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coffeeName: String, coffeePrice: String, coffeeImage: Int) {
            binding.buyAgainCoffeeName.text = coffeeName
            binding.buyAgainCoffeePrice.text = coffeePrice
            binding.buyAgainCoffeeImage.setImageResource(coffeeImage)
        }

    }
}