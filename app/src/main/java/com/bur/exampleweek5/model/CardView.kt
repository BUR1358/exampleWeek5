package com.bur.exampleweek5.model

var cardList = mutableListOf<CardView>()

class CardView(
    var name: String,
    var tagID: String,
    var id: Int? = cardList.size
) {

}
