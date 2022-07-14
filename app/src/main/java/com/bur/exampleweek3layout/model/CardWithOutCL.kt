package com.bur.exampleweek3layout.model

var cardListWithOutCL = mutableListOf<CardWithOutCL>()

class CardWithOutCL(
    var cover: Int,
    var name: String,
    var id: Int? = cardListWithOutCL.size
) {

}
