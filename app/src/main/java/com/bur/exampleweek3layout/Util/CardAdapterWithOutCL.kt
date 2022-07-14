package com.bur.exampleweek3layout.Util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek3layout.databinding.CardCellBinding
import com.bur.exampleweek3layout.model.CardWithCL
import com.bur.exampleweek3layout.model.CardWithOutCL


class CardAdapterWithOutCL(private val cards: MutableList<CardWithOutCL>,private val cardClickListenerWithOutCL: CardClickListenerWithOutCL) :
    RecyclerView.Adapter<CardViewHolderWithOutCL>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolderWithOutCL {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolderWithOutCL(binding, cardClickListenerWithOutCL)
    }

    override fun onBindViewHolder(holder: CardViewHolderWithOutCL, position: Int) {
        holder.bindCard(cards[position])
    }

    override fun getItemCount(): Int = cards.size
}