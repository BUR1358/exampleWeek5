package com.bur.exampleweek3layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bur.exampleweek3layout.LayoutWithCL.CalcWithCL
import com.bur.exampleweek3layout.LayoutWithCL.LoginWitchCL
import com.bur.exampleweek3layout.LayoutWithCL.MessengerWithCL
import com.bur.exampleweek3layout.LayoutWithCL.MusicPlayerWithCL
import com.bur.exampleweek3layout.LayoutWithOutCl.CalcWithOutCL
import com.bur.exampleweek3layout.LayoutWithOutCl.LoginWithOutCL
import com.bur.exampleweek3layout.LayoutWithOutCl.MessangerWithOutCL
import com.bur.exampleweek3layout.LayoutWithOutCl.MusicPlayerWithOutCL
import com.bur.exampleweek3layout.Util.CardAdapterWithCL
import com.bur.exampleweek3layout.Util.CardAdapterWithOutCL
import com.bur.exampleweek3layout.Util.CardClickListenerWithCL
import com.bur.exampleweek3layout.Util.CardClickListenerWithOutCL
import com.bur.exampleweek3layout.databinding.ActivityMainBinding
import com.bur.exampleweek3layout.model.CardWithCL
import com.bur.exampleweek3layout.model.CardWithOutCL
import com.bur.exampleweek3layout.model.*

class MainActivity : AppCompatActivity(), CardClickListenerWithCL, CardClickListenerWithOutCL {
    lateinit var binding: ActivityMainBinding
    val mainActivity = this
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
            adapter = CardAdapterWithCL(cardListWithCL, mainActivity)
        }
    }

    fun MakeCardListWithOutCL() {
        binding.recyclerViewWithOutConstraintLayout.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapterWithOutCL(cardListWithOutCL, mainActivity)
        }
    }

    private fun generateCard() {
        val cardMPwithCL = CardWithCL(
            R.drawable.music_icon,
            "Экран Музыкального Плеера",
            "MusicPlayer"
        )
        cardListWithCL.add(cardMPwithCL)

        val cardMessendgerWithCL = CardWithCL(
            R.drawable.message_icon,
            "Экран Настроек Мессенджера",
            "Messanger"
        )
        cardListWithCL.add(cardMessendgerWithCL)

        val cardCalcWithCL = CardWithCL(
            R.drawable.calc_icon,
            "Экран Калькулятора",
            "Calc"
        )
        cardListWithCL.add(cardCalcWithCL)

        val cardLoginWithCL = CardWithCL(
            R.drawable.login_icon,
            "Экран Авторизации в приложение ",
            "Login"
        )
        cardListWithCL.add(cardLoginWithCL)


        val cardMPwithOutCL = CardWithOutCL(
            R.drawable.music_icon,
            "Экран Музыкального Плеера",
            "MusicPlayer"
        )
        cardListWithOutCL.add(cardMPwithOutCL)

        val cardMessendgerWithOutCL = CardWithOutCL(
            R.drawable.message_icon,
            "Экран Настроек Мессенджера",
            "Messanger"
        )
        cardListWithOutCL.add(cardMessendgerWithOutCL)

        val cardCalcWithOutCL = CardWithOutCL(
            R.drawable.calc_icon,
            "Экран Калькулятора",
            "Calc"
        )
        cardListWithOutCL.add(cardCalcWithOutCL)

        val cardLoginWithOutCL = CardWithOutCL(
            R.drawable.login_icon,
            "Экран Авторизации в приложение ",
            "Login"
        )
        cardListWithOutCL.add(cardLoginWithOutCL)
    }

    override fun OnClickWithCL(cardWithCL: CardWithCL) {
        if (cardWithCL.tagID == "MusicPlayer") {
            startActivity(Intent(applicationContext, MusicPlayerWithCL::class.java))
        } else if (cardWithCL.tagID == "Calc") {
            startActivity(Intent(applicationContext, CalcWithCL::class.java))
        } else if (cardWithCL.tagID == "Login") {
            startActivity(Intent(applicationContext, LoginWitchCL::class.java))
        } else if (cardWithCL.tagID == "Messanger") {
            startActivity(Intent(applicationContext, MessengerWithCL::class.java))
        }
    }

    override fun OnClickWithOutCL(cardWithOutCL: CardWithOutCL) {
        if (cardWithOutCL.tagID == "MusicPlayer") {
            startActivity(Intent(applicationContext, MusicPlayerWithOutCL::class.java))
        } else if (cardWithOutCL.tagID == "Calc") {
            startActivity(Intent(applicationContext, CalcWithOutCL::class.java))
        } else if (cardWithOutCL.tagID == "Login") {
            startActivity(Intent(applicationContext, LoginWithOutCL::class.java))
        } else if (cardWithOutCL.tagID == "Messanger") {
            startActivity(Intent(applicationContext, MessangerWithOutCL::class.java))
        }

    }
}