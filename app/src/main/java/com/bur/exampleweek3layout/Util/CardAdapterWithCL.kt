package com.bur.exampleweek3layout.Util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek3layout.databinding.CardCellBinding
import com.bur.exampleweek3layout.model.CardWithCL

class CardAdapterWithCL(
    private val cards: List<CardWithCL>, private val cardClickListenerWithCL: CardClickListenerWithCL
) :
    RecyclerView.Adapter<CardViewHolderWithCL>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolderWithCL {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolderWithCL(binding, cardClickListenerWithCL)
    }

    override fun onBindViewHolder(holder: CardViewHolderWithCL, position: Int) {
        holder.bindCard(cards[position])
    }

    override fun getItemCount(): Int = cards.size
}