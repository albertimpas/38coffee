package com.pos.user38.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pos.user38.databinding.MenuItemBinding

class MenuAdapter(private val menuItems:MutableList<String>, private val menuItemsPrice:MutableList<String>, private val menuImages:MutableList<Int>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding =  MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = menuItems.size

    inner class MenuViewHolder(private val binding: MenuItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply{
                menuCoffeeName.text = menuItems[position]
                menuPrice.text = menuItemsPrice[position]
                menuImage.setImageResource(menuImages[position])
            }
        }

    }
}