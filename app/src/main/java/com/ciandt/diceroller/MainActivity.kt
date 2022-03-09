package com.ciandt.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciandt.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.DiceRollerButton
        val textView = binding.diceRollerText
        button.text = getString(R.string.buttonRoll)

        button.setOnClickListener {
            textView.text = rollDice().toString()
        }
    }
    private fun rollDice(): Int {
        return Random().nextInt(6) + 1
    }
}