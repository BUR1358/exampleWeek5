package com.bur.exampleweek5.Util

import CardViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek5.databinding.CardCellBinding
import com.bur.exampleweek5.model.CardView

class CardAdapter(
    private val cards: List<CardView>, private val cardClickListenerWithCL: CardClickListener
) :
    RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, cardClickListenerWithCL)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindCard(cards[position])
    }

    override fun getItemCount(): Int = cards.size
}