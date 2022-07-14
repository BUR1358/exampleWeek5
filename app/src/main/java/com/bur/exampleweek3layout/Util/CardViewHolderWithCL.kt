package com.bur.exampleweek3layout.Util

import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek3layout.databinding.CardCellBinding
import com.bur.exampleweek3layout.model.CardWithCL

class CardViewHolderWithCL(
    private val cardCellBinding: CardCellBinding,
    private val cardClickListenerWithCL: CardClickListenerWithCL

) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindCard(cardWithCL: CardWithCL) {
        cardCellBinding.cover.setImageResource(cardWithCL.cover)
        cardCellBinding.cardName.text = cardWithCL.name

        cardCellBinding.cardView.setOnClickListener {
            cardClickListenerWithCL.OnClickWithCL(cardWithCL)
        }
    }
}