package com.bur.exampleweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bur.exampleweek5.Util.CardAdapter
import com.bur.exampleweek5.Util.CardClickListener
import com.bur.exampleweek5.apps.app1Dota2
import com.bur.exampleweek5.apps.app2Dota2
import com.bur.exampleweek5.apps.app3Tinder
import com.bur.exampleweek5.databinding.ActivityMainBinding
import com.bur.exampleweek5.model.CardView
import com.bur.exampleweek5.model.*

class MainActivity : AppCompatActivity(), CardClickListener {
    lateinit var binding: ActivityMainBinding
    val mainActivity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        generateCard()
        MakeCardListWithCL()
    }

    fun MakeCardListWithCL() {
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapter(cardList, mainActivity)
        }
    }


    private fun generateCard() {
        val app1Dota2 = CardView(
            "Dota 2 Okhttp + Moshi",
            "app1Dota2"
        )
        cardList.add(app1Dota2)

        val app2Dota2 = CardView(
            "Dota 2 Retrofit + Gson",
            "app2Dota2"
        )
        cardList.add(app2Dota2)

        val app3Tinder = CardView(

            "Tinder Ktor + Kotlin Serialization",
            "app3Tinder"
        )
        cardList.add(app3Tinder)

    }

    override fun OnClick(cardView: CardView) {
        if (cardView.tagID == "app1Dota2") {
            startActivity(Intent(applicationContext, app1Dota2::class.java))
        } else if (cardView.tagID == "app2Dota2") {
            startActivity(Intent(applicationContext, app2Dota2::class.java))
        } else if (cardView.tagID == "app3Tinder") {
            startActivity(Intent(applicationContext, app3Tinder::class.java))
        }
    }
}