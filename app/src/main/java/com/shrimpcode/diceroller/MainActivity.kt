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
        val rolled = Random.nextInt(sides) + 1
        binding.resultText.text = rolled.toString()
        makeShortToast("Dice rolled!")
    }
}