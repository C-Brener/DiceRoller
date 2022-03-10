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
        val imageView = binding.diceRollerImage

        button.setOnClickListener {
            when(rollDice().toString().toInt()){
                 1-> imageView.setImageResource(R.drawable.dice_1)
                 2-> imageView.setImageResource(R.drawable.dice_2)
                 3-> imageView.setImageResource(R.drawable.dice_3)
                 4-> imageView.setImageResource(R.drawable.dice_4)
                 5-> imageView.setImageResource(R.drawable.dice_5)
                else-> imageView.setImageResource(R.drawable.dice_6)
            }
        }
    }
    private fun rollDice(): Int {
        return Random().nextInt(6) + 1
    }
}