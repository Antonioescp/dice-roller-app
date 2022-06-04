package com.shrimpcode.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shrimpcode.diceroller.databinding.ActivityMainBinding
import com.shrimpcode.diceroller.extensions.makeShortToast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener { rollDice(6) }
    }

    fun rollDice(sides: Int) {
        val diceResult = Random.nextInt(sides) + 1
        val diceResource = when (diceResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        binding.diceImage.setImageResource(diceResource)

        makeShortToast("Dice rolled!")
    }
}