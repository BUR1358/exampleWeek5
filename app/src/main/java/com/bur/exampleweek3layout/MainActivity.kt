package com.bur.exampleweek3layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.bur.exampleweek3layout.Util.CardAdapterWithCL
import com.bur.exampleweek3layout.Util.CardAdapterWithOutCL
import com.bur.exampleweek3layout.Util.CardCliclListenerWithCL
import com.bur.exampleweek3layout.databinding.ActivityMainBinding
import com.bur.exampleweek3layout.model.CardWithCL
import com.bur.exampleweek3layout.model.CardWithOutCL
import com.bur.exampleweek3layout.model.*

class MainActivity : AppCompatActivity(), CardCliclListenerWithCL {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        generateCard()
        MakeCardListWithCL()
        MakeCardListWithOutCL()

    }

    fun MakeCardListWithCL() {
        binding.recyclerViewWithConstraintLayout.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapterWithCL(cardListWithCL)
        }
    }

    fun MakeCardListWithOutCL() {
        binding.recyclerViewWithOutConstraintLayout.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapterWithOutCL(cardListWithOutCL)
        }
    }

    private fun generateCard() {
        val cardMPwithCL = CardWithCL(
            R.drawable.music_icon,
            "Экран Музыкального Плеера"
        )
        cardListWithCL.add(cardMPwithCL)

        val cardMessendgerWithCL = CardWithCL(
            R.drawable.message_icon,
            "Экран Настроек Мессенджера"
        )
        cardListWithCL.add(cardMessendgerWithCL)

        val cardCalcWithCL = CardWithCL(
            R.drawable.calc_icon,
            "Экран Калькулятора"
        )
        cardListWithCL.add(cardCalcWithCL)

        val cardLoginWithCL = CardWithCL(
            R.drawable.login_icon,
            "Экран Авторизации в приложение "
        )
        cardListWithCL.add(cardLoginWithCL)


        val cardMPwithOutCL = CardWithOutCL(
            R.drawable.music_icon,
            "Экран Музыкального Плеера"
        )
        cardListWithOutCL.add(cardMPwithOutCL)

        val cardMessendgerWithOutCL = CardWithOutCL(
            R.drawable.message_icon,
            "Экран Настроек Мессенджера"
        )
        cardListWithOutCL.add(cardMessendgerWithOutCL)

        val cardCalcWithOutCL = CardWithOutCL(
            R.drawable.calc_icon,
            "Экран Калькулятора"
        )
        cardListWithOutCL.add(cardCalcWithOutCL)

        val cardLoginWithOutCL = CardWithOutCL(
            R.drawable.login_icon,
            "Экран Авторизации в приложение "
        )
        cardListWithOutCL.add(cardLoginWithOutCL)
    }

    override fun OnClick(cardWithCL: CardWithCL) {
        Log.e("MYlogger", "нажатие")
    }
}