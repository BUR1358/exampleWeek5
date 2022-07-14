package com.bur.exampleweek3layout.model

import android.content.Intent

var cardListWithCL = mutableListOf<CardWithCL>()

class CardWithCL(
    var cover: Int,
    var name: String,
    var tagID: String,
    var id: Int? = cardListWithCL.size
) {

}
