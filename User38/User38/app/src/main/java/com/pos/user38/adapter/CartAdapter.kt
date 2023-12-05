package com.pos.user38.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pos.user38.databinding.CartItemBinding

class CartAdapter(private val cartItems:MutableList<String>, private val cartItemsPrice:MutableList<String>, private val CartImage : MutableList<Int>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){

private val itemQuantities = IntArray(cartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartAdapter.CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

    inner class CartViewHolder(private val binding: CartItemBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantities[position]
                cartCoffeeName.text = cartItems[position]
                cartItemPrice.text = cartItemsPrice[position]
                cartImage.setImageResource(CartImage[position])
                cartItemQuanity.text = quantity.toString()

                minusButton.setOnClickListener {
                    decreaseQuantity(position)
                }

                addButton.setOnClickListener {
                    increaseQuantity(position)
                }

                deleteButton.setOnClickListener {
                    val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION)
                        deleteItem(position)
                }
            }
        }
        private fun decreaseQuantity(position : Int){
            if(itemQuantities[position]>1){
                itemQuantities[position]--
                binding.cartItemQuanity.text = itemQuantities[position].toString()
            }
        }
        private fun increaseQuantity(position : Int){
            if(itemQuantities[position]<10){
                itemQuantities[position]++
                binding.cartItemQuanity.text = itemQuantities[position].toString()
            }
        }
        private fun deleteItem(position : Int){
            cartItems.removeAt(position)
            cartItemsPrice.removeAt(position)
            CartImage.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, cartItems.size)
        }
    }
}