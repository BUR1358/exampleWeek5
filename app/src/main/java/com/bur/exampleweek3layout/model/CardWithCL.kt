package com.bur.exampleweek3layout.model

var cardListWithCL = mutableListOf<CardWithCL>()

class CardWithCL(
    var cover: Int,
    var name: String,
    var id: Int? = cardListWithCL.size
) {

}
