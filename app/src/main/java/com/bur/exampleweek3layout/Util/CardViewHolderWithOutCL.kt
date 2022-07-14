package com.bur.exampleweek3layout.Util

import androidx.recyclerview.widget.RecyclerView
import com.bur.exampleweek3layout.databinding.CardCellBinding
import com.bur.exampleweek3layout.model.CardWithOutCL

class CardViewHolderWithOutCL(
    private val cardCellBinding: CardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindCard(cardWithOutCL: CardWithOutCL) {
        cardCellBinding.cover.setImageResource(cardWithOutCL.cover)
        cardCellBinding.cardName.text = cardWithOutCL.name
    }
}