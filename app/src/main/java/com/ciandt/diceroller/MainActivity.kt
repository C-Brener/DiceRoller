package com.ciandt.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.ciandt.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImage:ImageView
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.DiceRollerButton
        diceImage = binding.diceRollerImage
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        button.setOnClickListener {
            viewModel.rollDice()
        }
        viewModel.drawableSet.observe(this, androidx.lifecycle.Observer {
            binding.diceRollerImage.setImageResource(it)
        })
    }


}